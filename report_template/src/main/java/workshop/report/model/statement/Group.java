package workshop.report.model.statement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "Group")
@Table(name = "Group")
public class Group {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GroupId", nullable = false, unique = true)
	private Integer groupId;

	@Column(name = "Name", nullable = true)
	private String name;

	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "SectionId")
	private Section section;
}