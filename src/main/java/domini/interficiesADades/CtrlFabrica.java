package domini.interficiesADades;


/* Imports de la classe */

import dades.controladorsDeDades.*;

/* Capa de Dades */
public class CtrlFabrica {
	
	 private static IntCtrlDepartament icb;
	 private static IntCtrlEmpleats ice;
	
	 /* un constructor privat evita que des de fora se'n crei m�s d'una inst�ncia */
	 /* l'�nic objecte es crea des de dins */		
	 private CtrlFabrica() { 
		 icb = new CtrlDepartament();
		 ice = new CtrlEmpleat();
	 	}
	
	 public static CtrlFabrica obteCtrlFabrica() {
		 return new CtrlFabrica(); 
	 }
	 
	 public static IntCtrlDepartament obteCtrlDepartament() {
		 return icb;
	 }
	 
	 public static IntCtrlEmpleats obteCtrlEmpleat() {
		 return ice;
	 }
	 
}