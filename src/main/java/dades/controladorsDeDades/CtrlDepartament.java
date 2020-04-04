package dades.controladorsDeDades;

/* Imports de la classe */
import java.util.*;

import javax.persistence.*;
//import javax.persistence.criteria.*;

import dades.excepcions.*;
import domini.interficiesADades.*;
import domini.model.Departament;
//import domini.model.Instalacio;
//import serveisComuns.baseDeDades.*;

/* Capa de Dades */
public class CtrlDepartament implements IntCtrlDepartament {
	
	public Departament obte(EntityManager em, int idDept) throws DepartamentNoExisteix {
			Departament dep = (Departament) em.find(Departament.class, idDept);
			if (dep == null) throw new DepartamentNoExisteix();
			return dep;
	}
	
	public Boolean existeix(EntityManager em, int idDept) throws DepartamentNoExisteix{
		Departament dep = (Departament) em.getReference(Departament.class, idDept);
		if (dep == null) throw new DepartamentNoExisteix();
		return true;
	}
	
	public List<Departament> tots(EntityManager em) {
		List<Departament> bibs = em.createQuery("select d from Departament d", Departament.class).getResultList();
		return bibs;
	}
	
}