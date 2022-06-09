package nounous.jsf.data;



import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import javax.validation.constraints.NotBlank;





@SuppressWarnings("serial")
public class Contrat implements Serializable {




// Champs


private Integer id;

@NotBlank( message = "La date de debut doit etre renseigner ")
private Date date_debut;

@NotBlank( message = "La date de fin doit etre renseigner ")
private Date date_fin;

private String specifications;

private Enfant enfant;

private Nounous nounous;





// Constructeurs

public Contrat() {
}



/*public Garde(, String nom, String prenom, Date date_naiss, Date date_inscription, String sexe ) {
super();


}*/





public Contrat(Integer id, Date date_debut, Date date_fin, String specifications,
Enfant enfant, Nounous nounous) {
super();
this.id = id;
this.date_debut = date_debut;
this.date_fin = date_fin;
this.specifications = specifications;
this.enfant = enfant;
this.nounous = nounous;
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
var other = (Contrat) obj;
return Objects.equals(id, other.id);
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