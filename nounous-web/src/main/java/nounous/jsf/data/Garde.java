package nounous.jsf.data;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



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

	/*public Garde(, String nom, String prenom, Date date_naiss, Date date_inscription, String sexe ) {
		super();
	
		
	}*/
	
	
	// Getters & setters
	
	public Date getDate_garde() {
		return date_garde;
	}

	public void setDate_garde(Date date_garde) {
		this.date_garde = date_garde;
	}

	public Time getHeure_arrivee() {
		return heure_arrivee;
	}

	public void setHeure_arrivee(Time heure_arrivee) {
		this.heure_arrivee = heure_arrivee;
	}

	public Time getHeure_depart() {
		return heure_depart;
	}

	public void setHeure_depart(Time heure_depart) {
		this.heure_depart = heure_depart;
	}

	public boolean isRepas() {
		return repas;
	}

	public void setRepas(boolean repas) {
		this.repas = repas;
	}


	
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
