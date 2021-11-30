package model;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="personne")
public class Personne {

	/* Attributs */
	
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

	
	/* Méthodes */
	
	public Personne(){
		
	} // default constructor
	
	
	public Personne(String nom, String prenom, String equipe, String entreprise) {
		this.nom = nom;
		this.prenom = prenom;
		this.equipe = equipe;
		this.entreprise = entreprise;
	}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String service) {
        this.equipe = service;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }
}
