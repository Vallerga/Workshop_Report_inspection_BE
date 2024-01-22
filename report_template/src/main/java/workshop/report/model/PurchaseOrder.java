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
import javax.persistence.Table;

@Entity(name = "PurchaseOrder")
@Table(name = "PurchaseOrder")
public class PurchaseOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PurchaseOrderId", nullable = false, unique = true)
	private Integer purchaseOrderId;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "CustomerId")
	private Customer customer;

	@Column(name = "Amount", nullable = true)
	private Integer amount;

	@Column(name = "EmissionDate", nullable = true)
	private Date emissionDate;
	
	@Column(name = "DueDate", nullable = true)
	private Date dueDate;
}
