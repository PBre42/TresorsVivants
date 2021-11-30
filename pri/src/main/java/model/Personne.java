package model;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="personne")
public class Personne {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	/* Nom de la personne */
	@Column(name="nom")
	private String nom;
	
	/* Prénom de la personne */
	@Column(name="prenom")
	private String prenom;
	
	/* Equipe de la personne (r&d, rh, etc.)*/
	@Column(name="equipe")
	private String equipe;
	
	/* Entreprise de la personne */
	@Column(name="entreprise")
	private String entreprise;
	
	/* Droit de la personne pour valider des compétences*/
	@Column(name="droit")
	private String droit;
	
	/* Mail de la personne */
	@Column(name="mail")
	private String mail;
	
	/* Téléphone de la personne */
	@Column(name="tel")
	private String tel;
	
	/* Date de naissance de la personne */
	@Column(name="datedenaissance")
	private Date datedenaissance;
	
	/* Login de la personne */
	@Column(name="login")
	private String login;
	
	/* Mot de passe de la personne */
	//private string password; //A encrypter
}
