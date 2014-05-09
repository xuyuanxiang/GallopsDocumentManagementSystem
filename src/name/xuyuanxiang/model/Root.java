package name.xuyuanxiang.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "sys_root")
public class Root implements Serializable {
	private static final long serialVersionUID = -633771657317612711L;
	private String id;
	private String name;
	private String absolutePath;
	private Boolean hidden;
	private Boolean enabled;

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid.hex")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "root_name", unique = true, nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "root_absolute_path", unique = true, nullable = false)
	public String getAbsolutePath() {
		return absolutePath;
	}

	public void setAbsolutePath(String absolutePath) {
		this.absolutePath = absolutePath;
	}

	@Column(name = "root_is_hidden")
	@org.hibernate.annotations.Type(type = "yes_no")
	public Boolean getHidden() {
		return hidden;
	}

	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}

	@Column(name = "root_is_enabled")
	@org.hibernate.annotations.Type(type = "yes_no")
	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public int hashCode() {
		return absolutePath == null ? 0 : absolutePath.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Root))
			return false;
		final Root other = (Root) obj;
		return !(absolutePath != null ? !absolutePath.equals(other
				.getAbsolutePath()) : other.getAbsolutePath() != null);
	}

	@Override
	public String toString() {
		ToStringBuilder sb = new ToStringBuilder(this,
				ToStringStyle.DEFAULT_STYLE).append("root", absolutePath);
		return sb.toString();
	}

}
