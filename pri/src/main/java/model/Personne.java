package model;

import javax.persistence.*;

@Entity
@Table(name="personne")
public class Personne {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@Column(name="service")
	private String service;
		
	@Id
	@Column(name="entreprise")
	private long entreprise;
	
	
}
