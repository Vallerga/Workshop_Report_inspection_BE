package workshop.report.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import workshop.report.model.template.ComponentTemplate;
import workshop.report.model.value.solution2_table_dublication.FlagStatementOutcome;
import workshop.report.model.value.solution2_table_dublication.NumberStatementOutcome;
import workshop.report.model.value.solution2_table_dublication.PictureStatementOutcome;
import workshop.report.model.value.solution2_table_dublication.TextStatementOutcome;

@Entity(name = "InspectionReport")
@Table(name = "InspectionReport")
public class InspectionReport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "InspectionReportId", nullable = false, unique = true)
	private Integer inspectionReportId;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "ComponentTemplateId")
	private List<ComponentTemplate> componentTemplates;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ServiceOrderId")
	private ServiceOrder serviceOrder;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "FlagStatementOutcomeId")
	private List<FlagStatementOutcome> flagStatementOutcomes;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "TextStatementOutcomeId")
	private List<TextStatementOutcome> textStatementOutcomes;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "NumberStatementOutcomeId")
	private List<NumberStatementOutcome> numberStatementOutcomes;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "PictureStatementOutcomeId")
	private List<PictureStatementOutcome> pictureStatementOutcomes;

	@Column(name = "StartDate", nullable = true)
	private Date startdate;

	@Column(name = "EndDate", nullable = true)
	private Date endDate;
}