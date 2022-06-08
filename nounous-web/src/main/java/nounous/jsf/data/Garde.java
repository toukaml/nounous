package nounous.jsf.data;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

import javax.validation.constraints.NotBlank;



@SuppressWarnings("serial")
public class Garde implements Serializable {


	// Champs
	
	
	private Integer			id;
	
	@NotBlank( message = "La date doit etre renseigner ")
	private Date			date_garde;
	
	@NotBlank( message = "L'heure doit etre renseigner ")
	private Time			heure_arrivee;
	
	private Time			heure_depart;

	private String			repas;
	
	private Enfant enfant;
	
	private Nounous nounous;

	
	
	// Constructeurs
	
	public Garde() {
	}

	/*public Garde(, String nom, String prenom, Date date_naiss, Date date_inscription, String sexe ) {
		super();
	
		
	}*/
	
	public Garde(Integer id, Date date_garde, Time heure_arrivee,Enfant enfant, Nounous nunous ) {
		
		this.id=id;
		this.date_garde=date_garde;
		this.heure_arrivee=heure_arrivee;
		this.enfant=enfant;
		this.nounous=nunous;
		
	}

	
	
	// Getters & setters
	



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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public String getRepas() {
		return repas;
	}

	public void setRepas(String repas) {
		this.repas = repas;
	}

	public Enfant getEnfant() {
		return enfant;
	}

	public void setEnfant(Enfant enfant) {
		this.enfant = enfant;
	}

	public Nounous getNounous() {
		return nounous;
	}

	public void setNounous(Nounous nounous) {
		this.nounous = nounous;
	}

	


}
