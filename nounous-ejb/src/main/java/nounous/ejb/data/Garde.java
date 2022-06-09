package nounous.ejb.data;

import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table( name = "garde" )
public class Garde  {


	// Champs
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer			id;
	
	@Column(name = "date_garde")
	private Date			date_garde;
	
	@Column(name = "heure_arrivee")
	private Time			heure_arrivee;
	
	@Column(name = "heure_depart")
	private Time			heure_depart;

	@Column(name = "repas")
	private String			repas;
	
	
	@ManyToOne
	@JoinColumn(name = "id_enfant")
	private Enfant enfant;
	
	@ManyToOne
	@JoinColumn(name = "id_nounous")
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
