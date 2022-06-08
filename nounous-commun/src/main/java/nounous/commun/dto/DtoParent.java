package nounous.commun.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



@SuppressWarnings("serial")
public class DtoParent implements Serializable {

	// Champs

	private Integer id;

	private String nom;

	private String prenom;

	private String password;

	private String email;

	private String telephone;

	private String adresse;

	private String caracteristiques;

	private String numero_cni;

	private String date_naissance;


	// Constructeurs

	public DtoParent() {
	}

	public DtoParent(Integer id, String nom, String prenom,  String password, String email, String telephone, String adresse, String cni ) {
	
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.password=this.prenom;
		this.email= email;
		this.telephone=telephone;
		this.adresse=adresse;
		this.numero_cni=cni;
		
	}
	
	// Getters & setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getCaracteristiques() {
		return caracteristiques;
	}

	public void setCaracteristiques(String caracteristiques) {
		this.caracteristiques = caracteristiques;
	}

	public String getNumero_cni() {
		return numero_cni;
	}

	public void setNumero_cni(String numero_cni) {
		this.numero_cni = numero_cni;
	}

	public String getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}

	public void setId(Integer id) {
		this.id = id;
	}




}
