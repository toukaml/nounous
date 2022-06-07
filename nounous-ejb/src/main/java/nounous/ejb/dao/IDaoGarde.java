package nounous.ejb.dao;

import java.util.List;

import nounous.ejb.data.Garde;
import nounous.ejb.data.Garde;


public interface IDaoGarde {

	int			inserer( Garde garde );

	void 		modifier( Garde garde );

	void 		supprimer( int idgarde );

	Garde 	retrouver( int idgarde );

	List<Garde> listerTout();

}
