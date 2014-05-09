package name.xuyuanxiang.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "T_USER", schema = "obpm")
public class User implements Serializable {
	private static final long serialVersionUID = -5612730765617045046L;

	private String id;
	private String email;
	private String username;
	private String password;
	private String name;
	private String telephone;
	private Long status;
	private Long lockflag;
	private Department defaultDepartment;
	private User superior;
	private Set<Role> roles = new HashSet<Role>();
	private Set<Department> departments = new HashSet<Department>();

	@Transient
	public Set<Group> getGroups() {
		Set<Group> groups = new HashSet<Group>();
		for (Group group : defaultDepartment.getGroups()) {
			if (group.getEnable() && !groups.contains(group))
				groups.add(group);
		}
		for (Role role : roles) {
			for (Group group : role.getGroups()) {
				if (group.getEnable() && !groups.contains(group))
					groups.add(group);
			}
		}
		for (Department department : departments) {
			for (Group group : department.getGroups()) {
				if (group.getEnable() && !groups.contains(group))
					groups.add(group);
			}
		}
		return groups;
	}

	@Transient
	public boolean hasPrivilege(Privilege privilege) {
		return getPrivileges().contains(privilege);
	}

	@Transient
	public List<Privilege> getPrivileges() {
		Set<Privilege> privilegeSet = new HashSet<Privilege>();
		for (Group group : getGroups()) {
			if (group.getEnable()) {
				for (Privilege privilege : group.getPrivileges()) {
					privilegeSet.add(privilege);
				}
			}
		}
		List<Privilege> privileges = new ArrayList<Privilege>(privilegeSet);
		return privileges;
	}

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid.hex")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "DEFAULTDEPARTMENT")
	public Department getDefaultDepartment() {
		return defaultDepartment;
	}

	public void setDefaultDepartment(Department defaultDepartment) {
		this.defaultDepartment = defaultDepartment;
	}

	@Column(name = "EMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "LOGINNO")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "LOGINPWD")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "TELEPHONE")
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(name = "STATUS")
	public Long getStatus() {
		return status;
	}

	@Column(name = "LOCKFLAG")
	public Long getLockflag() {
		return lockflag;
	}

	public void setLockflag(Long lockflag) {
		this.lockflag = lockflag;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "SUPERIOR")
	public User getSuperior() {
		return superior;
	}

	public void setSuperior(User superior) {
		this.superior = superior;
	}

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "t_user_role_set", schema = "obpm", joinColumns = { @JoinColumn(name = "USERID") }, inverseJoinColumns = { @JoinColumn(name = "ROLEID") })
	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "t_user_department_set", schema = "obpm", joinColumns = { @JoinColumn(name = "USERID") }, inverseJoinColumns = { @JoinColumn(name = "DEPARTMENTID") })
	public Set<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(Set<Department> departments) {
		this.departments = departments;
	}

	@Override
	public int hashCode() {
		return username == null ? 0 : username.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof User)) {
			return false;
		}
		final User user = (User) obj;
		return !(username != null ? !username.equals(user.getUsername()) : user
				.getUsername() != null);
	}

	@Override
	public String toString() {
		ToStringBuilder sb = new ToStringBuilder(this,
				ToStringStyle.DEFAULT_STYLE).append(
				"department",
				defaultDepartment == null ? "null" : defaultDepartment
						.toString()).append("user", this.username);
		return sb.toString();
	}

}
