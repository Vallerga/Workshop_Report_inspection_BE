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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "Employee")
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EmployeeId", nullable = false, unique = true)
	private Integer employeeId;

	@Column(name = "Name", nullable = true)
	private String name;

	@Column(name = "Surname", nullable = true)
	private String surname;

	@Column(name = "Role", nullable = true)
	private String role;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "WorkshopId")
	private Workshop workshop;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "ServiceOrderId")
	private List<ServiceOrder> serviceOrders;
}
