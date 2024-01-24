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

@Entity(name = "Section")
@Table(name = "Section")
public class Section {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SectionId", nullable = false, unique = true)
	private Integer sectionId;

	@Column(name = "Name", nullable = true)
	private String name;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ComponentTemplateId")
	private ComponentTemplate componentTemplate;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "GroupId")
	private List<Group> groups;
}