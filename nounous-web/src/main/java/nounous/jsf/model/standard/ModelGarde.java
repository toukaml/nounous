package nounous.jsf.model.standard;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import nounous.commun.dto.DtoGarde;

import nounous.commun.service.IServiceGarde;

import nounous.jsf.data.Garde;
import nounous.jsf.data.Personne;

import nounous.jsf.data.mapper.IMapper;


@SuppressWarnings("serial")
@ViewScoped
@Named
public class ModelGarde implements Serializable {

	
	// Champs
	
	private List<Garde>		liste;
	
	private Personne			courant;
	
	
	private IServiceGarde  	serviceGarde;

	@Inject
	private IMapper				mapper;

	
	// Getters 
	
	public List<Garde> getListe() {
		if ( liste == null ) {
			liste = new ArrayList<>();
			for ( DtoGarde dto : serviceGarde.listerTout() ) {
				liste.add( mapper.map( dto ) );
			}
		}
		return liste;
	}

	public Personne getCourant() {
		if ( courant == null ) {
			courant = new Personne();
		}
		return courant;
	}
	
	
	// Initialisaitons
	
	/*public String actualiserCourant() {
		if ( courant != null ) {
			DtoPersonne dto = servicePersonne.retrouver( courant.getId() ); 
			if ( dto == null ) {
				UtilJsf.messageError( "La personne demandée n'existe pas" );
				return "liste";
			} else {
				courant = mapper.map( dto );
			}
		}
		return null;
	}
	
	
	// Actions
	
	public String validerMiseAJour() {
		try {
			if ( courant.getId() == null) {
				servicePersonne.inserer( mapper.map(courant) );
			} else {
				servicePersonne.modifier( mapper.map(courant) );
			}
			UtilJsf.messageInfo( "Mise à jour effectuée avec succès." );
			return "liste";
		} catch (ExceptionValidation e) {
			UtilJsf.messageError(e);
			return null;
		}
	}
	
	public String supprimer( Personne personne ) {
		try {
			servicePersonne.supprimer( personne.getId() );
			liste.remove(personne);
			UtilJsf.messageInfo( "Suppression effectuée avec succès." );
		} catch (ExceptionValidation e) {
			UtilJsf.messageError( e ); 
		}
		return null;
	}
	
	
	public String ajouterTelephone() {
		courant.getTelephones().add( new Telephone() );
		return null;
	}
	
	
	public String supprimerTelephone( Telephone telephone ) {
		for ( int i=0; i < courant.getTelephones().size(); ++i ) {
			if ( courant.getTelephones().get(i) == telephone ) {
				courant.getTelephones().remove( i );
				break;
			}
		}
		return null;
	}*/
	
}
