package nounous.ejb.service.standard;

import static javax.ejb.TransactionAttributeType.NOT_SUPPORTED;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.inject.Inject;

import nounous.commun.dto.DtoGarde;
import nounous.commun.exception.ExceptionValidation;
import nounous.commun.service.IServiceGarde;
import nounous.ejb.dao.IDaoGarde;
import nounous.ejb.data.Garde;
import nounous.ejb.data.mapper.IMapperEjb;

@Stateless
@Remote
public class ServiceGarde implements IServiceGarde {

	// Champs
	@Inject
	private IMapperEjb mapper;
	@Inject
	private IDaoGarde daoGarde;

	// Actions

	@Override
	public int inserer(DtoGarde dtoGarde) throws ExceptionValidation {
		//verifierValiditeDonnees(dtoGarde);
		int id = daoGarde.inserer(mapper.map(dtoGarde));
		return id;
	}

	@Override
	public void modifier(DtoGarde dtoGarde) throws ExceptionValidation {
		//verifierValiditeDonnees(dtoGarde);
		daoGarde.modifier(mapper.map(dtoGarde));
	}

	@Override
	public void supprimer(int idGarde) throws ExceptionValidation {
		daoGarde.supprimer(idGarde);
	}

	@Override
	@TransactionAttribute(NOT_SUPPORTED)
	public DtoGarde retrouver(int idGarde) {
		Garde garde = daoGarde.retrouver(idGarde);
		return mapper.map(garde);

	}

	@Override
	@TransactionAttribute(NOT_SUPPORTED)
	public List<DtoGarde> listerTout() {
		List<DtoGarde> liste = new ArrayList<>();
		for (Garde garde : daoGarde.listerTout()) {
			liste.add( mapper.mapMinimal(garde) );
		}
		
		System.out.println("service garde "+ liste.size());
		return liste;
	}

	// Méthodes auxiliaires
/*
	private void verifierValiditeDonnees(DtoGarde dtoGarde) throws ExceptionValidation {

		StringBuilder message = new StringBuilder();

		if (dtoGarde.getNom() == null || dtoGarde.getNom().isEmpty()) {
			message.append("\nLe nom est absent.");
		} else if (dtoGarde.getNom().length() > 25) {
			message.append("\nLe nom est trop long.");
		}

		if (dtoGarde.getPrenom() == null || dtoGarde.getPrenom().isEmpty()) {
			message.append("\nLe prénom est absent.");
		} else if (dtoGarde.getPrenom().length() > 25) {
			message.append("\nLe prénom est trop long.");
		}

		for (DtoTelephone telephoe : dtoGarde.getTelephones()) {
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
