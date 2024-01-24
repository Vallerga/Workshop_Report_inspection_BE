package workshop.report.model.value.solution1_table_inheritance;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import workshop.report.model.InspectionReport;
import workshop.report.model.template.QualityStatement;

@Entity(name = "StatementOutcome")
@Table(name = "StatementOutcome")
public class StatementOutcome {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "StatementOutcomeId", nullable = false, unique = true)
	private Integer statementOutcomeId;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "QualityStatementId")
	private QualityStatement qualityStatement;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "InspectionReportId")
	private InspectionReport inspectionReport;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "FlagStatementOutcomeId")
	private List<FlagStatementOutcome> flagStatementOutcomes;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "TextStatementOutcomeId")
	private List<TextStatementOutcome> textStatementOutcomes;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "TextStatementOutcomeId")
	private List<NumberStatementOutcome> numberStatementOutcomes;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "TextStatementOutcomeId")
	private List<PictureStatementOutcome> pictureStatementOutcomes;
}