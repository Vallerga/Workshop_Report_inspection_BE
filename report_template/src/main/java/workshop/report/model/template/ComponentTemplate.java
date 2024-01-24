package workshop.report.model.template;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import workshop.report.model.InspectionReport;

@Entity(name = "ComponentTemplate")
@Table(name = "ComponentTemplate")
public class ComponentTemplate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ComponentTemplateId", nullable = false, unique = true)
	private Integer componentTemplateId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "InspectionReportId")
	private InspectionReport inspectionReport;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "SectionId")
	private List<Section> sections;

	@Column(name = "Name", nullable = true)
	private String name;

	@Column(name = "typeCode", nullable = true)
	private String typeCode;

	@Column(name = "Version", nullable = true, unique = true)
	private String version;
}