package domini.model;

import dades.excepcions.SouSupera2000;

import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the empleats database table.
 * 
 */

@Entity
@Table(name = "empleats")
//@NamedQuery(name = "empleats.findAll", query = "SELECT e FROM empleats e")
public class Empleat {

   /* per implementar */
    @Id
    private Integer numEmpl;
    private String nomEmpl;
    private Integer souE;
    private String ciutatE;

    @ManyToOne(fetch = FetchType.EAGER)
    private Departament departament;

    public Integer getNumEmpl() {
        return numEmpl;
    }

    public void setNumEmpl(Integer numEmpl) {
        this.numEmpl = numEmpl;
    }

    public String getNomEmpl() {
        return nomEmpl;
    }

    public void setNomEmpl(String nomEmpl) {
        this.nomEmpl = nomEmpl;
    }

    public Integer getSouE() {
        return souE;
    }

    public void setSouE(Integer souE) {
        this.souE = souE;
    }

    public String getCiutatE() {
        return ciutatE;
    }

    public void setCiutatE(String ciutatE) {
        this.ciutatE = ciutatE;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public void incrementaSou(int incr){

    }
}