package domini.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;

/**
 * The persistent class for the departaments database table.
 * 
 */
@Entity
@Table(name = "Departament")
@NamedQuery(name = "Departament.findAll", query = "SELECT d FROM Departament d")
public class Departament {

       /* per implementar */
    @Id
    private Integer numDept;
    private String nomDept;
    private Integer plantaD;
    private String edificiD;
    private String ciutatD;

    @OneToMany(mappedBy = "empleat", fetch = FetchType.EAGER)
    private Set<Empleat> empleats;

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

    public Set<Empleat> getEmpleats() {
        return empleats;
    }

    public void setEmpleats(Set<Empleat> empleats) {
        this.empleats = empleats;
    }

    public Integer donaTotalSou(){

        return 0;
    }
}