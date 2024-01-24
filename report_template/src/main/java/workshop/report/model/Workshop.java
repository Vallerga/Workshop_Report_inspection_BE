package workshop.report.model;

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

@Entity(name = "Workshop")
@Table(name = "Workshop")
public class Workshop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "WorkshopId", nullable = false, unique = true)
	private Integer workshopId;

	@Column(name = "Name", nullable = true)
	private String name;

	@Column(name = "Address", nullable = true)
	private String address;

	@Column(name = "Telephone", nullable = true)
	private Integer telephone;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "EmployeeId")
	private Employee manager;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "EmployeeId")
	private List<Employee> employees;
}
