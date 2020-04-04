package dades.controladorsDeDades;

import java.util.List;

import javax.persistence.EntityManager;

/* Imports de la classe */

import dades.excepcions.*;
import domini.interficiesADades.*;
import domini.model.*;

/* Capa de Dades */
public class CtrlEmpleat implements IntCtrlEmpleats{
	
public Empleat obte(EntityManager em, int idEmpl) throws EmpleatNoExisteix {
		Empleat emp = (Empleat) em.find(Empleat.class, idEmpl);
		if (emp == null) throw new EmpleatNoExisteix();
		return emp;
}

public Boolean existeix(EntityManager em, int idEmpl) throws EmpleatNoExisteix{
	Empleat emp = (Empleat) em.getReference(Empleat.class, idEmpl);
	if (emp == null) throw new EmpleatNoExisteix();
	return true;
}

public List<Empleat> tots(EntityManager em) {
	List<Empleat> emps = em.createQuery("select e from Empleat e", Empleat.class).getResultList();
	return emps;
}


}