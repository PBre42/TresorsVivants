package model;

import javax.persistence.*;

@Entity
@Table(name="competence")
public class Competence {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	/* Nom de la compétence */
	@Column(name="nom")
	private String nom;
	
	/* Description de la compétence */
	@Column(name="definition")
	private String definition;

	/* Catégorie de la compétence */
	@Column(name="categorie")
	private String categorie;
	
	/* Tâche à faire afin de valider la compétence */
	@Column(name="tache")
	private String tache;
	
	/* Quand et pourquoi utiliser cette compétence */
	@Column(name="utilisation")
	private String utilisation;
}
