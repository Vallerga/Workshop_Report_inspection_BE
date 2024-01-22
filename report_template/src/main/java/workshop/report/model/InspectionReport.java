package workshop.report.model;

import java.util.Date;

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

@Entity(name = "InspectionReport")
@Table(name = "InspectionReport")
public class InspectionReport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "InspectionReportId", nullable = false, unique = true)
	private Integer inspectionReportId;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "ComponentTemplateId")
	private ComponentTemplate template;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ServiceOrderId")
	private ServiceOrder serviceOrder;

	@Column(name = "StartDate", nullable = true)
	private Date startdate;

	@Column(name = "EndDate", nullable = true)
	private Date endDate;
}