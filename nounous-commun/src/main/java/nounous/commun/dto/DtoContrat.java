package nounous.commun.dto;



import java.io.Serializable;
import java.sql.Date;
import java.util.List;




@SuppressWarnings("serial")
public class DtoContrat implements Serializable {


// Champs

private int id;

private Date date_debut;

private Date date_fin;

private String specifications;

private DtoEnfant enfant;

private DtoNounous nounous;


// Constructeurs

public DtoContrat() {
}



public DtoContrat(int id, Date date_debut, Date date_fin, String specifications, DtoCategorie categorie,
List<DtoTelephone> telephones) {
super();
this.id = id;
this.date_debut = date_debut;
this.date_fin = date_fin;
this.specifications = specifications;

}




// Getters & setters









public int getId() {
return id;
}



public void setId(int id) {
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



/*public DtoCategorie getCategorie() {
return categorie;
}



public void setCategorie(DtoCategorie categorie) {
this.categorie = categorie;
}



public void setTelephones(List<DtoTelephone> telephones) {
this.telephones = telephones;
}*/



}