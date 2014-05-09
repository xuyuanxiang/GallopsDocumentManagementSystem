package name.xuyuanxiang.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "sys_group")
public class Group implements Serializable {

	private static final long serialVersionUID = 2474907981361733803L;

	private String id;
	private String name;
	private Boolean enable;
	private String description;
	private Set<Privilege> privileges = new HashSet<Privilege>();
	private Set<Department> departments = new HashSet<Department>();
	private Set<Role> roles = new HashSet<Role>();

	public void removePrivilege(String privilegeId) {
		for (Privilege privilege : privileges) {
			if (privilege.getId().equals(privilegeId)) {
				privileges.remove(privilege);
				break;
			}
		}
	}

	@Transient
	public void removeDepartment(String deptId) {
		for (Department department : departments) {
			if (department.getId().equals(deptId)) {
				departments.remove(department);
				break;
			}
		}
	}

	@Transient
	public void removeRole(String roleId) {
		for (Role role : roles) {
			if (role.getId().equals(roleId)) {
				roles.remove(role);
				break;
			}
		}
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

	@Column(name = "group_name", nullable = false, unique = true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "group_is_enabled")
	@org.hibernate.annotations.Type(type = "yes_no")
	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	@Column(name = "group_desc")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "r_privilege_group", joinColumns = { @JoinColumn(name = "group_id") }, inverseJoinColumns = { @JoinColumn(name = "privilege_id") })
	@OrderBy("id")
	public Set<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(Set<Privilege> privileges) {
		this.privileges = privileges;
	}

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "r_department_group", joinColumns = { @JoinColumn(name = "group_id") }, inverseJoinColumns = { @JoinColumn(name = "department_id") })
	@OrderBy("code")
	public Set<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(Set<Department> departments) {
		this.departments = departments;
	}

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "r_role_group", joinColumns = { @JoinColumn(name = "group_id") }, inverseJoinColumns = { @JoinColumn(name = "role_id") })
	@OrderBy("sortid")
	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@Override
	public int hashCode() {
		return name == null ? 0 : name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Group)) {
			return false;
		}
		final Group other = (Group) obj;
		return !(name != null ? !name.equals(other.getName())
				: other.getName() != null);
	}

	@Override
	public String toString() {
		ToStringBuilder sb = new ToStringBuilder(this,
				ToStringStyle.DEFAULT_STYLE).append("group", this.name);
		return sb.toString();
	}
}
