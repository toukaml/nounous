package nounous.ejb.service.standard;

import static javax.ejb.TransactionAttributeType.NOT_SUPPORTED;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.inject.Inject;

import nounous.commun.dto.DtoContrat;
import nounous.commun.exception.ExceptionValidation;
import nounous.commun.service.IServiceContrat;
import nounous.ejb.dao.IDaoContrat;
import nounous.ejb.data.Contrat;
import nounous.ejb.data.mapper.IMapperEjb;

@Stateless
@Remote
public class ServiceContrat implements IServiceContrat {

	// Champs
	@Inject
	private IMapperEjb mapper;
	@Inject
	private IDaoContrat daoContrat;

	// Actions

	@Override
	public int inserer(DtoContrat dtoContrat) throws ExceptionValidation {
		//verifierValiditeDonnees(dtoContrat);
		int id = daoContrat.inserer(mapper.map(dtoContrat));
		return id;
	}

	@Override
	public void modifier(DtoContrat dtoContrat) throws ExceptionValidation {
		//verifierValiditeDonnees(dtoContrat);
		daoContrat.modifier(mapper.map(dtoContrat));
	}

	@Override
	public void supprimer(int idContrat) throws ExceptionValidation {
		daoContrat.supprimer(idContrat);
	}

	@Override
	@TransactionAttribute(NOT_SUPPORTED)
	public DtoContrat retrouver(int idContrat) {
		Contrat contrat = daoContrat.retrouver(idContrat);
		return mapper.map(contrat);

	}

	@Override
	@TransactionAttribute(NOT_SUPPORTED)
	public List<DtoContrat> listerTout() {
		List<DtoContrat> liste = new ArrayList<>();
		for (Contrat contrat : daoContrat.listerTout()) {
			liste.add( mapper.mapMinimal(contrat) );
		}
		
		System.out.println("service contrat "+ liste.size());
		return liste;
	}

	// Méthodes auxiliaires
/*
	private void verifierValiditeDonnees(DtoContrat dtoContrat) throws ExceptionValidation {

		StringBuilder message = new StringBuilder();

		if (dtoContrat.getNom() == null || dtoContrat.getNom().isEmpty()) {
			message.append("\nLe nom est absent.");
		} else if (dtoContrat.getNom().length() > 25) {
			message.append("\nLe nom est trop long.");
		}

		if (dtoContrat.getPrenom() == null || dtoContrat.getPrenom().isEmpty()) {
			message.append("\nLe prénom est absent.");
		} else if (dtoContrat.getPrenom().length() > 25) {
			message.append("\nLe prénom est trop long.");
		}

		for (DtoTelephone telephoe : dtoContrat.getTelephones()) {
			if (telephoe.getLibelle() == null || telephoe.getLibelle().isEmpty()) {
				message.append("\nLlibellé absent pour le téléphone : " + telephoe.getNumero());
			} else if (telephoe.getLibelle().length() > 25) {
				message.append("\nLe libellé du téléphone est trop long : " + telephoe.getLibelle());
			}

			if (telephoe.getNumero() == null || telephoe.getNumero().isEmpty()) {
				message.append("\nNuméro absent pour le téléphone : " + telephoe.getLibelle());
			} else if (telephoe.getNumero().length() > 25) {
				message.append("\nLe numéro du téléphone est trop long : " + telephoe.getNumero());
			}
		}

		if (message.length() > 0) {
			throw new ExceptionValidation(message.toString().substring(1));
		}
	}*/

}
