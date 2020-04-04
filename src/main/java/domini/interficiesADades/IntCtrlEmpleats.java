package domini.interficiesADades;

/* Imports de la classe */
import java.util.*;

import javax.persistence.EntityManager;

import dades.excepcions.*;
import domini.model.*; 

/* Capa de Dades */
public interface IntCtrlEmpleats {
	
	public Empleat obte(EntityManager em, int idEmpl) throws EmpleatNoExisteix;
	
	public Boolean existeix(EntityManager em, int idEmpl) throws EmpleatNoExisteix;
	
	public List<Empleat> tots(EntityManager em); 
}