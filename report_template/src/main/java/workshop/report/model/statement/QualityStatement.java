package workshop.report.model.statement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity(name = "QualityStatement")
@Table(name = "QualityStatement")
public class QualityStatement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "QualityStatementId", nullable = false, unique = true)
	private Integer qualityStatementId;
	
	@Column(name = "IdentificationCode", nullable = true)
	private String identificationCode;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "GroupId")
	private Group group;
}