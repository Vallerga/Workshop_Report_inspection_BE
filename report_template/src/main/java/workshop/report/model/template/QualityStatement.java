package workshop.report.model.template;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import workshop.report.model.value.solution1_table_inheritance.FlagStatementOutcome;
import workshop.report.model.value.solution1_table_inheritance.NumberStatementOutcome;
import workshop.report.model.value.solution1_table_inheritance.PictureStatementOutcome;
import workshop.report.model.value.solution1_table_inheritance.TextStatementOutcome;

@Entity(name = "QualityStatement")
@Table(name = "QualityStatement")
public class QualityStatement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "QualityStatementId", nullable = false, unique = true)
	private Integer qualityStatementId;
	
	@Column(name = "IdentificationCode", nullable = true)
	private String identificationCode;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "GroupId")
	private Group group;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FlagStatementOutcomeId")
	private FlagStatementOutcome flagStatementOutcome;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "TextStatementOutcomeId")
	private TextStatementOutcome textStatementOutcome;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "NumberStatementOutcomeId")
	private NumberStatementOutcome numnberStatementOutcome;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "PictureStatementOutcomeId")
	private PictureStatementOutcome pictureStatementOutcome;
}