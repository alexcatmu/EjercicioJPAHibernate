package domini.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;

/**
 * The persistent class for the departaments database table.
 * 
 */
@Entity
@Table(name = "departaments")
//@NamedQuery(name = "departaments.findAll", query = "SELECT d FROM departaments d")
public class Departament {

       /* per implementar */
    @Id
    private Integer numDept;
    private String nomDept;
    private Integer plantaD;
    private String edificiD;
    private String ciutatD;

    @OneToMany(mappedBy = "departament", fetch = FetchType.EAGER)
    private Set<Empleat> empleat;

    public Integer getNumDept() {
        return numDept;
    }

    public void setNumDept(Integer numDept) {
        this.numDept = numDept;
    }

    public String getNomDept() {
        return nomDept;
    }

    public void setNomDept(String nomDept) {
        this.nomDept = nomDept;
    }

    public Integer getPlantaD() {
        return plantaD;
    }

    public void setPlantaD(Integer plantaD) {
        this.plantaD = plantaD;
    }

    public String getEdificiD() {
        return edificiD;
    }

    public void setEdificiD(String edificiD) {
        this.edificiD = edificiD;
    }

    public String getCiutatD() {
        return ciutatD;
    }

    public void setCiutatD(String ciutatD) {
        this.ciutatD = ciutatD;
    }

    public Set<Empleat> getEmpleat() {
        return empleat;
    }

    public void setEmpleat(Set<Empleat> empleat) {
        this.empleat = empleat;
    }

    public Integer donaTotalSou(){
        int totalSou = 0;
        for(Empleat e: this.empleat){
            totalSou += e.getSouE();
        }
        return totalSou;
    }
}