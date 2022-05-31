package nounous.ejb.data;


import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table( name = "enfant" )
public class Enfant  {


	// Champs
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer			id;
	
	@Column(name = "nom")
	private String			nom;
	
	@Column(name = "prenom")
	private String			prenom;

	
	@Column(name = "date_inscription")
	private Date		date_inscription;
	
	@Column(name = "date_naissance")
	private Date		date_naissance;
	
	@Column(name = "sexe")
	private String		sexe;
	
	@Column(name = "allergie")
	private String		allergies;
	
	@Column(name = "infos")
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
