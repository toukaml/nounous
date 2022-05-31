package nounous.ejb.data;



import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table( name = "parent" )
public class Parent  {


	// Champs
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer	id;
	
	@Column(name = "nom")
	private String	nom;

	@Column(name = "prenom")
	private String	prenom;

	
	@Column(name = "password")
	private String	password;
	
	@Column(name = "email")
	private String	email;
	
	
	@Column(name = "telephone")
	private String	telephone;
	
	
	@Column(name = "adresse")
	private String	adresse;
	
	@Column(name = "caracteristiques")
	private String	caracteristiques;
	
	@Column(name = "numero_cni")
	private String	numero_cni;
	
	@Column(name = "date_naissance")
	private String	date_naissance;
	

	

	
	// Constructeurs
	
	public Parent() {
	}

	public Parent(Integer id, String nom, String prenom,  String password, String email, String telephone, String adresse, String cni ) {
		super();
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		var other = (Parent) obj;
		return Objects.equals(id, other.id);
	}
	

}
