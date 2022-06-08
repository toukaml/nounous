package nounous.commun.dto;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;



@SuppressWarnings("serial")
public class DtoEnfant implements Serializable {

	// Champs

	//
	private Integer id;

	private String nom;

	private String prenom;

	private Date date_inscription;

	private Date date_naissance;

	private String sexe;

	private String allergies;

	private String infos;
	// Constructeurs

	public DtoEnfant() {
	}

	public DtoEnfant(Integer id, String nom, String prenom, Date date_naiss, Date date_inscription, String sexe ) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance=date_naiss;
		this.date_inscription=date_inscription;
		this.sexe=sexe;
		
		
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

	public Date getDate_inscription() {
		return date_inscription;
	}

	public void setDate_inscription(Date date_inscription) {
		this.date_inscription = date_inscription;
	}

	public Date getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public String getInfos() {
		return infos;
	}

	public void setInfos(String infos) {
		this.infos = infos;
	}
	
	

}
