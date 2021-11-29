package model;

import javax.persistence.*;

@Entity
@Table(name="correspondance")
public class Correspondance {
	
	@Id
	private long id_personne;
	
	@Id
	private long id_competence;
	
	private String note;

}
