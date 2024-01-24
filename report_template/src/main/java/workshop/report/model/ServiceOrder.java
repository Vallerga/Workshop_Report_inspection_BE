package workshop.report.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "ServiceOrder")
@Table(name = "ServiceOrder")
public class ServiceOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ServiceOrderId", nullable = false, unique = true)
	private Integer serviceOrderId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CustomerId")
	private Customer customer;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "PurchaseOrderId")
	private PurchaseOrder purchaseOrder;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "EmployeeId")
	private List<Employee> employees;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "InspectionReportId")
	private InspectionReport inspectionReportId;
}