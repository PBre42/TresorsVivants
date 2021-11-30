package model;

import javax.persistence.*;

@Entity
@Table(name="correspondance")
public class Correspondance {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	/* Id de la personne */
	@Id
	private long id_personne;
	
	/* Id de la compétence*/
	@Id
	private long id_competence;
	
	/* Niveau de maîtrise de la compétence par la personne*/
	@Column(name="note")
	private String note;

}
