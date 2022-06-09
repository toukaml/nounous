package nounous.ejb.data;



import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table( name = "nounous" )

public class Nounous  {


	// Champs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer			id;
	
	@Column(name = "nom")
	private String			nom;

	@Column(name = "prenom")
	private String			prenom;


	
	@Column(name = "password")
	private String		password;
	
	@Column(name = "email")
	private String		email;
	
	
	@Column(name = "telephone")
	private String		telephone;
	
	
	@Column(name = "adresse")
	private String		adresse;
	
	@Column(name = "tarif_horaire")
	private float		tarif;
	

	
	// Constructeurs
	
	public Nounous() {
	}

	public Nounous(Integer id, String nom, String prenom, String email, String telephone, String adresse ) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.password="password";
		this.email= email;
		this.telephone=telephone;
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
