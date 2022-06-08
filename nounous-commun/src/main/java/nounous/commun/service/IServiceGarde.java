package nounous.commun.service;

import java.util.List;

import nounous.commun.dto.DtoGarde;
import nounous.commun.exception.ExceptionValidation;


public interface IServiceGarde {
	
	int				inserer( DtoGarde dtoGarde ) throws ExceptionValidation;
	
	void			modifier( DtoGarde dtoGarde ) throws ExceptionValidation;
	
	void			supprimer( int idGarde ) throws ExceptionValidation;
	
	DtoGarde 	retrouver( int idGarde );
	
	List<DtoGarde> listerTout();
	

}
