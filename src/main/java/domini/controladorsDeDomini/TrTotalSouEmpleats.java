package domini.controladorsDeDomini;

/* Imports de la classe */
import java.util.List;

import javax.persistence.EntityManager;

import dades.excepcions.DepartamentNoExisteix;
import dades.excepcions.EmpleatNoExisteix;
import dades.excepcions.SouSupera2000;
import serveisComuns.baseDeDades.*;
import domini.excepcions.*;
import domini.interficiesADades.*;
import domini.model.*;


/* Capa de Domini */
public class TrTotalSouEmpleats extends Transaccio {
	
	private int idDept;

	private String nomD;

	private int totalSous;
	
	public TrTotalSouEmpleats(int numD) {
		idDept = numD;
	}
	
	public void executa(Gestor g) throws DODepartamentNoExisteix {

		/* per implementar */

	}
	
	public int donaTotalSou() {
		return totalSous;
	}
	
	public String donaNomDepartament() {
		return nomD;
	}


}