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


	
	@NotNull( message = "La catégorie est obligatoire")
	private String		password;
	
	@NotNull( message = "L'email  est obligatoire")
	private String		email;
	
	
	@NotNull( message = "Le telephone  est obligatoire")
	private String		telephone;
	
	
	@NotNull( message = "L'adresse  est obligatoire")
	private String		adresse;
	
	@NotNull( message = "La tarif  est obligatoire")
	private float		tarif;
	
	


	
	// Constructeurs
	
	public Nounous() {
	}

	public Nounous(Integer id, String nom, String prenom, String email, String telephone, String adresse,float tarif ) {
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
