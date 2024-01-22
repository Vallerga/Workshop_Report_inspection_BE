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
import workshop.report.model.template.QualityStatement;

@Entity(name = "PictureStatementOutcome")
@Table(name = "PictureStatementOutcome")
public class PictureStatementOutcome {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PictureStatementOutcomeId", nullable = false, unique = true)
	private Integer pictureStatementOutcomeId;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "QualityStatementId")
	private QualityStatement qualityStatement;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "InspectionReportId")
	private InspectionReport inspectionReport;

	@Column(name = "FilePath", nullable = true)
	private String filePath;
}