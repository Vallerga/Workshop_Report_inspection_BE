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

@Entity(name = "PictureStatementOutcome")
@Table(name = "PictureStatementOutcome")
public class PictureStatementOutcome {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PictureStatementOutcomeId", nullable = false, unique = true)
	private Integer pictureStatementOutcomeId;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "StatementOutcomeId")
	private StatementOutcome statementOutcome;

	@Column(name = "FilePath", nullable = true)
	private String filePath;
}