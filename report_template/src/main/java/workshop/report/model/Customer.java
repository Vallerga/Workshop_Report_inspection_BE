package workshop.report.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Customer")
@Table(name = "Customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CustomerId", nullable = false, unique = true)
	private Integer customerId;

	@Column(name = "Name", nullable = true)
	private String name;

	@Column(name = "Surname", nullable = true)
	private String surname;

	@Column(name = "Telephone", nullable = true)
	private String telephone;
}