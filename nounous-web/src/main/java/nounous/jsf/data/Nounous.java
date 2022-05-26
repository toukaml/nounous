package nounous.jsf.data;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@SuppressWarnings("serial")
public class Nounous implements Serializable {


	// Champs
	
	private Integer			id;
	
	@NotBlank( message = "Le nom doit être renseigné")
	@Size(max=25, message = "Valeur trop longue pour le nom : 50 car. maxi" )
	private String			nom;

	@NotBlank( message = "Le prénom doit être renseigné")
	@Size(max=25, message = "Valeur trop longue pour le prénom : 25 car. maxi" )
	private String			prenom;

	
	@NotNull( message = "La date  est obligatoire")
	private Date		date_naissance;
	
	@NotNull( message = "La catégorie est obligatoire")
	private String		password;
	
	@NotNull( message = "La cni  est obligatoire")
	private String		numero_cni;
	
	@NotNull( message = "L'email  est obligatoire")
	private String		email;
	
	
	@NotNull( message = "Le telephone  est obligatoire")
	private String		telephone;
	
	
	@NotNull( message = "L'adresse  est obligatoire")
	private String		adresse;
	
	
	private String		caracteristiques;

	
	// Constructeurs
	
	public Nounous() {
	}

	public Nounous(Integer id, String nom, String prenom, Date date, String password, String email, String telephone, String adresse, String cni ) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance=date;
		this.password="password";
		this.email= email;
		this.telephone=telephone;
		this.numero_cni=cni;
		this.adresse=adresse;
		
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNumero_cni() {
		return numero_cni;
	}

	public void setNumero_cni(String numero_cni) {
		this.numero_cni = numero_cni;
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



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		var other = (Nounous) obj;
		return Objects.equals(id, other.id);
	}
	

}
