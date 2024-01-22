package workshop.report.model.value.solution2_table_dublication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import workshop.report.model.InspectionReport;
import workshop.report.model.statement.QualityStatement;

@Entity(name = "TextStatementOutcome")
@Table(name = "TextStatementOutcome")
public class TextStatementOutcome {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TextStatementOutcomeId", nullable = false, unique = true)
	private Integer textStatementOutcomeId;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "QualityStatementId")
	private QualityStatement qualityStatement;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "InspectionReportId")
	private InspectionReport inspectionReport;

	@Column(name = "Value", nullable = true)
	private String value;
}