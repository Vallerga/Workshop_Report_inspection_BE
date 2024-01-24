package workshop.report.model.value.solution2_table_dublication;

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

import workshop.report.model.InspectionReport;
import workshop.report.model.template.QualityStatement;

@Entity(name = "FlagStatementOutcome")
@Table(name = "FlagStatementOutcome")
public class FlagStatementOutcome {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FlagStatementOutcomeId", nullable = false, unique = true)
	private Integer flagStatementOutcomeId;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "QualityStatementId")
	private QualityStatement qualityStatement;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "InspectionReportId")
	private InspectionReport inspectionReport;

	@Column(name = "Value", nullable = true)
	private Boolean value;
}