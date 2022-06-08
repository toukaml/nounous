package nounous.commun.dto;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;



@SuppressWarnings("serial")
public class DtoNounous implements Serializable {

	// Champs

	private Integer id;

	private String nom;

	private String prenom;

	private String password;

	private String email;

	private String telephone;

	private String adresse;

	private float tarif;
	// Constructeurs

	public DtoNounous() {
	}

	public DtoNounous(Integer id, String nom, String prenom, String email, String telephone, String adresse,float tarif ) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.password=this.prenom;
		this.email= email;
		this.telephone=telephone;
		this.adresse=adresse;
		this.tarif=tarif;
		
	}
	
	// Getters & setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public void setId(Integer id) {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public float getTarif() {
		return tarif;
	}

	public void setTarif(float tarif) {
		this.tarif = tarif;
	}
	

}
