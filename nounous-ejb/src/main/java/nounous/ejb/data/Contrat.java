package nounous.ejb.data;

import java.sql.Date;
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
@Table( name = "contrat" )
public class Contrat  {


	// Champs
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer			id;
	
	@Column(name = "date_debut")
	private Date date_debut;

	@Column(name = "date_fin")
	private Date date_fin;

	@Column(name = "specifications")
	private String specifications;
	
	
	@ManyToOne
	@JoinColumn(name = "id_enfant")
	private Enfant enfant;
	
	@ManyToOne
	@JoinColumn(name = "id_nounous")
	private Nounous nounous;

	
	
	// Constructeurs
	
	public Contrat() {
	}

	
	
	
	// Getters & setters
	



	public Contrat(Integer id, Date date_debut, Date date_fin, String specifications, nounous.ejb.data.Enfant enfant,
			nounous.ejb.data.Nounous nounous) {
		super();
		this.id = id;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.specifications = specifications;
		this.enfant = enfant;
		this.nounous = nounous;
	}




	

	@Override
	public int hashCode() {
		return Objects.hash(date_debut, date_fin, enfant, id, nounous, specifications);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contrat other = (Contrat) obj;
		return Objects.equals(date_debut, other.date_debut) && Objects.equals(date_fin, other.date_fin)
				&& Objects.equals(enfant, other.enfant) && Objects.equals(id, other.id)
				&& Objects.equals(nounous, other.nounous) && Objects.equals(specifications, other.specifications);
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public Date getDate_debut() {
		return date_debut;
	}




	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}




	public Date getDate_fin() {
		return date_fin;
	}




	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}




	public String getSpecifications() {
		return specifications;
	}




	public void setSpecifications(String specifications) {
		this.specifications = specifications;
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
