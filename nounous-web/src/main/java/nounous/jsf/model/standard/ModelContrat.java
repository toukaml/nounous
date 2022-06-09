package nounous.jsf.model.standard;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import nounous.commun.dto.DtoContrat;
import nounous.commun.exception.ExceptionValidation;
import nounous.commun.service.IServiceContrat;
import nounous.jsf.data.Contrat;
import nounous.jsf.data.mapper.IMapper;
import nounous.jsf.util.UtilJsf;

@SuppressWarnings("serial")
@ViewScoped
@Named
public class ModelContrat implements Serializable {

// Champs

	private List<Contrat> liste;

	private Contrat courant;

	@EJB
	private IServiceContrat serviceContrat;

	@Inject
	private IMapper mapper;

// Getters

	public List<Contrat> getListe() {
		if (liste == null) {
			liste = new ArrayList<>();
			for (DtoContrat dto : serviceContrat.listerTout()) {
				liste.add(mapper.map(dto));
			}
		}
		return liste;
	}

	public Contrat getCourant() {
		if (courant == null) {
			courant = new Contrat();
		}
		return courant;
	}

// Initialisaitons

	public String actualiserCourant() {
		if (courant != null) {
			DtoContrat dto = serviceContrat.retrouver(courant.getId());
			if (dto == null) {
				UtilJsf.messageError("La contrat demandée n'existe pas");
				return "liste";
			} else {
				courant = mapper.map(dto);
			}
		}
		return null;
	}

// Actions

	public String validerMiseAJour() {
		try {
			if (courant.getId() == null) {
				serviceContrat.inserer(mapper.map(courant));
			} else {
				serviceContrat.modifier(mapper.map(courant));
			}
			UtilJsf.messageInfo("Mise à jour effectuée avec succès.");
			return "liste";
		} catch (ExceptionValidation e) {
			UtilJsf.messageError(e);
			return null;
		}
	}

	public String supprimer(Contrat contrat) {
		try {
			serviceContrat.supprimer(contrat.getId());
			liste.remove(contrat);
			UtilJsf.messageInfo("Suppression effectuée avec succès.");
		} catch (ExceptionValidation e) {
			UtilJsf.messageError(e);
		}
		return null;
	}

	/*
	 * public String ajouterTelephone() { courant.getTelephones().add( new
	 * Telephone() ); return null; }
	 * 
	 * 
	 * public String supprimerTelephone( Telephone telephone ) { for ( int i=0; i <
	 * courant.getTelephones().size(); ++i ) { if ( courant.getTelephones().get(i)
	 * == telephone ) { courant.getTelephones().remove( i ); break; } } return null;
	 * }
	 */

}