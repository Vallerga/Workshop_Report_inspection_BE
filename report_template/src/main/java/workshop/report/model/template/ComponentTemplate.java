package workshop.report.model.template;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "ComponentTemplate")
@Table(name = "ComponentTemplate")
public class ComponentTemplate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ComponentTemplateId", nullable = false, unique = true)
	private Integer componentTemplateId;

	@Column(name = "Name", nullable = true)
	private String name;

	@Column(name = "typeCode", nullable = true)
	private String typeCode;

	@Column(name = "Version", nullable = true, unique = true)
	private String version;
}