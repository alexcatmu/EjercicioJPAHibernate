package domini.controladorsDeDomini;

/* Imports de la classe */
//import java.util.List;

import javax.persistence.EntityManager;

import serveisComuns.baseDeDades.*;
import dades.excepcions.*;
import domini.interficiesADades.*;
import domini.model.*;
import domini.excepcions.*;

/* Capa de Domini */
public class TrCanviSouEmpleat extends Transaccio {

	private int idEmpl;

	private int incrSou;
	
	public TrCanviSouEmpleat(int numE, int incr) {
		idEmpl = numE;
		incrSou = incr;
	}
	
	public void executa(Gestor g) throws DOEmpleatNoExisteix, DOSouSupera2000 {

		/* per implementar */
		Empleat e = new Empleat();
		EntityManager em = g.getEntityManager();
		IntCtrlEmpleats ice = CtrlFabrica.obteCtrlEmpleat();
		try {
			e = ice.obte(em,idEmpl);
		} catch (EmpleatNoExisteix empleatNoExisteix) {
			throw new DOEmpleatNoExisteix();
		}

		try {
			e.incrementaSou(incrSou);
		} catch (SouSupera2000 souSupera2000) {
			throw new DOSouSupera2000();
		}

	}
}