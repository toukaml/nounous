package nounous.jsf.data;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@SuppressWarnings("serial")
public class Enfant implements Serializable {


	// Champs
	
	private Integer			id;
	
	@NotBlank( message = "Le nom doit être renseigné")
	@Size(max=25, message = "Valeur trop longue pour le nom : 50 car. maxi" )
	private String			nom;

	@NotBlank( message = "Le prénom doit être renseigné")
	@Size(max=25, message = "Valeur trop longue pour le prénom : 25 car. maxi" )
	private String			prenom;

	
	@NotNull( message = "La date  est obligatoire")
	private Date		date_inscription;
	
	@NotNull( message = "La date  est obligatoire")
	private Date		date_naissance;
	
	@NotNull( message = "Le sexe est obligatoire")
	private String		sexe;
	
	private String		allergies;
	
	private String		infos;
	
	

	
	// Constructeurs
	
	public Enfant() {
	}

	public Enfant(Integer id, String nom, String prenom, Date date_naiss, Date date_inscription, String sexe ) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance=date_naiss;
		this.date_inscription=date_inscription;
		this.sexe=sexe;
		
		
	}
	
	
	// Getters & setters


	
	// hashCode() & equals()

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	public Date getDate_inscription() {
		return date_inscription;
	}

	public void setDate_inscription(Date date_inscription) {
		this.date_inscription = date_inscription;
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
		var other = (Enfant) obj;
		return Objects.equals(id, other.id);
	}
	

}
