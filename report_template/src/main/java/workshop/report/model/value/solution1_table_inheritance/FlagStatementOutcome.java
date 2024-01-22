package workshop.report.model.value.solution1_table_inheritance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "FlagStatementOutcome")
@Table(name = "FlagStatementOutcome")
public class FlagStatementOutcome {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FlagStatementOutcomeId", nullable = false, unique = true)
	private Integer flagStatementOutcomeId;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "StatementOutcomeId")
	private StatementOutcome statementOutcome;

	@Column(name = "Value", nullable = true)
	private Boolean value;
}