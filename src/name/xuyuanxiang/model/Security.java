package name.xuyuanxiang.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

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
@Table(name = "biz_security")
public class Security implements Serializable {
	private static final long serialVersionUID = 9003344782580672330L;

	private String id;
	private Document document;
	private Group group;
	private Set<Operation> operations = new HashSet<Operation>();

	@Transient
	public void removeOperation(String operationId) {
		for (Operation operation : operations) {
			if (operation.getId().equals(operationId)) {
				operations.remove(operation);
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

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "folder_id", nullable = false)
	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "group_id", nullable = false)
	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name = "r_security_operation", joinColumns = { @JoinColumn(name = "security_id") }, inverseJoinColumns = { @JoinColumn(name = "operation_id") })
	public Set<Operation> getOperations() {
		return operations;
	}

	public void setOperations(Set<Operation> operations) {
		this.operations = operations;
	}

	@Override
	public int hashCode() {
		int code = group.hashCode();
		code += document.hashCode();
		return code;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Security))
			return false;
		final Security other = (Security) obj;
		return !(document != null ? !document.equals(other.getDocument())
				: other.getDocument() != null)
				&& !(group != null ? !group.equals(other.getGroup()) : other
						.getGroup() != null);
	}

	@Override
	public String toString() {
		ToStringBuilder sb = new ToStringBuilder(this,
				ToStringStyle.DEFAULT_STYLE).append("document",
				document == null ? "null" : document.toString()).append(
				"group", group == null ? "null" : group.toString());
		return sb.toString();
	}

}
