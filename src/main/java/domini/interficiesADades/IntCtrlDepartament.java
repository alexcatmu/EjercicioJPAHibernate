package domini.interficiesADades;

/* Imports de la classe */
import java.util.*;

import javax.persistence.EntityManager;

import dades.excepcions.*;
import domini.model.*;

/* Capa de Dades */
public interface IntCtrlDepartament {
	
	 public Departament obte(EntityManager em, int idDept) throws DepartamentNoExisteix;
	
	 public Boolean existeix(EntityManager em, int idDept) throws DepartamentNoExisteix;
	
	 public List<Departament> tots(EntityManager em);
	
}