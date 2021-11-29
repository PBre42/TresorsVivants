package model;

import javax.persistence.*;

@Entity
@Table(name="competence")
public class Competence {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Column(name="nom")
	private String nom;
	
	@Column(name="description")
	private String description;
}
