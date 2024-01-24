package workshop.report.model.value.solution3_field_duplication;

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
	
	@Column(name = "BoolValue", nullable = true)
	private Boolean flagValue;
	
	@Column(name = "TextValue", nullable = true)
	private String textValue;
	
	@Column(name = "NumberValue", nullable = true)
	private Integer numberValue;
	
	@Column(name = "FileValue", nullable = true)
	private String filePath;

	@Column(name = "TypeValue", nullable = true)
	private String typeValue;
}