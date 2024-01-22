package workshop.report.model.value.solution1_table_inheritance;

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

@Entity(name = "StatementOutcome")
@Table(name = "StatementOutcome")
public class StatementOutcome {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "StatementOutcomeId", nullable = false, unique = true)
	private Integer statementOutcomeId;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "QualityStatementId")
	private QualityStatement qualityStatement;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "InspectionReportId")
	private InspectionReport inspectionReport;
}