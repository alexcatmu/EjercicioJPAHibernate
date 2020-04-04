package presentacio;

/* Imports de la classe */
import java.io.*;

import javax.persistence.*;

//import serveisComuns.baseDeDades.JPAUtil;

import dades.excepcions.*;
//import serveisComuns.entradaSortida.*;
import serveisComuns.baseDeDades.*;
//import serveisComuns.objectesAuxiliars.Tuple;
import domini.controladorsDeDomini.*;
import domini.excepcions.*;
import domini.interficiesADades.CtrlFabrica;

/* Capa de presentacio */
class Exercise1Test {

    public static void main(String[] args) {
	try {
	    // Use persistence.xml configuration */
	    Gestor g = new Gestor();
	    // EntityManagerFactory emf = g.newEMFactory();
	    EntityManager em = g.newEntityManager(); // Retrieve an application managed entity manager
	    // EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();

	    /* Prepara la fabrica per obtenir els controladors */
	    CtrlFabrica.obteCtrlFabrica();

	    /* Entrada de dades a traves del teclat */
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    System.out.println("BD inicialitzada amb els departaments 22, 33, 44 i 55");
	    System.out.println();
	    System.out.println("El departament 22 té els empleats 1,2,3,4, cadascú cobra 1000 euros inicialment");
	    System.out.println("El departament 33 té els empleats 5,6,7, cadascú cobra 1000 euros inicialment");
	    System.out.println("El departament 44 té els empleats 8,9, cadascú cobra 1000 euros inicialment");
	    System.out.println("El departament 55 té els empleats 10,11,12,13,14,15, cadascú cobra 1000 euros inicialment");
	    System.out.println();
	    
	    
	    /* Test TxTotalSouEmpleats(idDept) */
	    System.out.println();
	    System.out.print("Test - TxTotalSouEmpleats(22), prem intro");
	    br.readLine();

	    try {
		em.getTransaction().begin();
		int idDept = 22;
		System.out.println("Num del departament " +idDept);
		//System.out.println();
		TrTotalSouEmpleats ttse = new TrTotalSouEmpleats(idDept);
		ttse.executa(g);
		int tse= ttse.donaTotalSou();
		String nde=ttse.donaNomDepartament();
		System.out.println("El sou total dels empleats del departament "+nde+" és " + tse);
		//System.out.println();
		em.getTransaction().commit();
	    } catch (DODepartamentNoExisteix bne) {
		System.out.println("El departament no existeix");
		em.getTransaction().rollback();
	    }
	    
	    /* Test TxTotalSouEmpleats(idDept) */
	   System.out.println();
	    System.out.print("Test - TxTotalSouEmpleats(44), prem intro");
	    br.readLine();

	    try {
		em.getTransaction().begin();
		int idDept = 44;
		System.out.println("Num del departament " +idDept);
		//System.out.println();
		TrTotalSouEmpleats ttse = new TrTotalSouEmpleats(idDept);
		ttse.executa(g);
		int tse= ttse.donaTotalSou();
		String nde=ttse.donaNomDepartament();
		System.out.println("El sou total dels empleats del departament "+nde+" és " + tse);
		//System.out.println();
		em.getTransaction().commit();
	    } catch (DODepartamentNoExisteix bne) {
		System.out.println("El departament no existeix");
		em.getTransaction().rollback();
	    }
	    
	    /* Test TxTotalSouEmpleats(idDept) */
	    System.out.println();
	    System.out.print("Test - TxTotalSouEmpleats(66), prem intro");
	    br.readLine();

	    try {
		em.getTransaction().begin();
		int idDept = 66;
		System.out.println("Num del departament " +idDept);
		//System.out.println();
		TrTotalSouEmpleats ttse = new TrTotalSouEmpleats(idDept);
		ttse.executa(g);
		int tse= ttse.donaTotalSou();
		String nde=ttse.donaNomDepartament();
		System.out.println("El sou total dels empleats del departament "+nde+" és " + tse);
		//System.out.println();
		em.getTransaction().commit();
	    } catch (DODepartamentNoExisteix bne) {
		System.out.println("El departament no existeix");
		em.getTransaction().rollback();
	    }
	    
	    /* Test TrCanviSouEmpleat(idEmpl,incrSou) */
	    System.out.println();
	    System.out.print("Test - TrCanviSouEmpleat(1,500), prem intro");
	    br.readLine();

	    try {
		em.getTransaction().begin();
		int idEmpl = 1;
		int incrementSou = 500;
		System.out.println("Canvi sou empleat " + idEmpl + " en " + incrementSou + " euros");
		//System.out.println();
		TrCanviSouEmpleat tcse = new TrCanviSouEmpleat(idEmpl, incrementSou);
		tcse.executa(g);
		System.out.println("Increment de sou fet");
		//System.out.println();
		em.getTransaction().commit();
	    } catch (DOEmpleatNoExisteix llne) {
		System.out.println("El empleat no existeix");
		em.getTransaction().rollback();
	    } catch (DOSouSupera2000 bne) {
		System.out.println("El sou final superaria els 2000 euros");
		em.getTransaction().rollback();
	    }
	    
	    /* Test TrCanviSouEmpleat(idEmpl,incrSou) */
	    System.out.println();
	    System.out.print("Test - TrCanviSouEmpleat(1,500), prem intro");
	    br.readLine();

	    try {
		em.getTransaction().begin();
		int idEmpl = 1;
		int incrementSou = 700;
		System.out.println("Canvi sou empleat " + idEmpl + " en " + incrementSou + " euros");
		//System.out.println();
		TrCanviSouEmpleat tcse = new TrCanviSouEmpleat(idEmpl, incrementSou);
		tcse.executa(g);
		System.out.println("Increment de sou fet");
		//System.out.println();
		em.getTransaction().commit();
	    } catch (DOEmpleatNoExisteix llne) {
		System.out.println("El empleat no existeix");
		em.getTransaction().rollback();
	    } catch (DOSouSupera2000 bne) {
		System.out.println("El sou final superaria els 2000 euros");
		em.getTransaction().rollback();
	    }
	    
	    /* Test TrCanviSouEmpleat(idEmpl,incrSou) */
	    System.out.println();
	    System.out.print("Test - TrCanviSouEmpleat(1,700), prem intro");
	    br.readLine();

	    try {
		em.getTransaction().begin();
		int idEmpl = 8;
		int incrementSou = 200;
		System.out.println("Canvi sou empleat " + idEmpl + " en " + incrementSou + " euros");
		//System.out.println();
		TrCanviSouEmpleat tcse = new TrCanviSouEmpleat(idEmpl, incrementSou);
		tcse.executa(g);
		System.out.println("Increment de sou fet");
		//System.out.println();
		em.getTransaction().commit();
	    } catch (DOEmpleatNoExisteix llne) {
		System.out.println("El empleat no existeix");
		em.getTransaction().rollback();
	    } catch (DOSouSupera2000 bne) {
		System.out.println("El sou final superaria els 2000 euros");
		em.getTransaction().rollback();
	    }
	    
	    /* Test TxTotalSouEmpleats(idDept) */
	    System.out.println();
	    System.out.print("Test - TxTotalSouEmpleats(22), prem intro");
	    br.readLine();

	    try {
		em.getTransaction().begin();
		int idDept = 22;
		System.out.println("Num del departament " +idDept);
		//System.out.println();
		TrTotalSouEmpleats ttse = new TrTotalSouEmpleats(idDept);
		ttse.executa(g);
		int tse= ttse.donaTotalSou();
		String nde=ttse.donaNomDepartament();
		System.out.println("El sou total dels empleats del departament "+nde+" és " + tse);
		//System.out.println();
		em.getTransaction().commit();
	    } catch (DODepartamentNoExisteix bne) {
		System.out.println("El departament no existeix");
		em.getTransaction().rollback();
	    }
	    
	    /* Test TxTotalSouEmpleats(idDept) */
	    System.out.println();
	    System.out.print("Test - TxTotalSouEmpleats(44), prem intro");
	    br.readLine();

	    try {
		em.getTransaction().begin();
		int idDept = 44;
		System.out.println("Num del departament " +idDept);
		//System.out.println();
		TrTotalSouEmpleats ttse = new TrTotalSouEmpleats(idDept);
		ttse.executa(g);
		int tse= ttse.donaTotalSou();
		String nde=ttse.donaNomDepartament();
		System.out.println("El sou total dels empleats del departament "+nde+" és " + tse);
		//System.out.println();
		em.getTransaction().commit();
	    } catch (DODepartamentNoExisteix bne) {
		System.out.println("El departament no existeix");
		em.getTransaction().rollback();
	    }   

	    System.out.println();
	    System.out.println("Fi del programa");
	    
	    /* Desconnectar-se a la base de dades */
	    em.close();
	}
	// catch (IOException bde) {
	// System.out.println("Error al llegir la opcio seleccionada");
	// }
	catch (Exception e) {
	    /* Qualsevol altre error */
	    System.out.println(e.getMessage());
	}
    }
}