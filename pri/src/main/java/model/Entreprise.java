package model;

import javax.persistence.*;

@Entity
@Table(name="entreprise")
public class Entreprise {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	/* Nom de l'entreprise*/
	@Column(name="nom")
	private String nom;
	
	/* Dirigeant(s) de l'entreprise*/
	@OneToMany//(mappedBy="personne")?
	@Column(name="dirigeant")
	private Personne dirigeant;
	
}
