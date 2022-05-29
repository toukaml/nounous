package nounous.jsf.data;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@SuppressWarnings("serial")
public class Garde implements Serializable {


	// Champs
	
	private Integer			id;
	
	@NotBlank( message = "La date doit etre renseigner ")
	@Size(max=25, message = "Valeur trop longue pour le nom : 50 car. maxi" )
	private Date			date_garde;
	
	@NotBlank( message = "L'heure  être renseigner ")
	@Size(max=25, message = "Valeur trop longue pour le nom : 50 car. maxi" )
	private Time heure_arrivee;
	

	@Size(max=25, message = "Valeur trop longue pour le nom : 50 car. maxi" )
	private Time heure_depart;

	private boolean repas;


	
	

	
	// Constructeurs
	
	public Garde() {
	}

	public Garde(, String nom, String prenom, Date date_naiss, Date date_inscription, String sexe ) {
		super();
	
		
	}
	
	
	// Getters & setters


	
	// hashCode() & equals()

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	public Integer getId() {
		return id;
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

	public Date getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		var other = (Garde) obj;
		return Objects.equals(id, other.id);
	}
	

}
