package model;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="session")
public class Session {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	/* Id du responsable de la session */
	@Id
	@Column(name="responsable")
	private long responsable;
	
	/* Date de la session */
	@Column(name="date")
	private Date date;
	
	
}
