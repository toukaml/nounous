package nounous.commun.dto;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class DtoGarde implements Serializable {

	// Champs

	//
	private Integer id;

	private Date date_garde;

	private Time heure_arrivee;

	private Time heure_depart;

	private String repas;

	private DtoEnfant enfant;

	private DtoNounous nounous;

	// Constructeurs

	public DtoGarde() {
	}

	public DtoGarde(int id, Time heure_arrivee, Time heure_depart, String repas) {
		super();
		this.id = id;
		this.heure_arrivee = heure_arrivee;
		this.heure_depart = heure_depart;
		this.repas = repas;
	}

	// Getters & setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public void setId(Integer id) {
		this.id = id;
	}

	public DtoEnfant getEnfant() {
		return enfant;
	}

	public void setEnfant(DtoEnfant enfant) {
		this.enfant = enfant;
	}

	public DtoNounous getNounous() {
		return nounous;
	}

	public void setNounous(DtoNounous nounous) {
		this.nounous = nounous;
	}

}
