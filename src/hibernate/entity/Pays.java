package hibernate.entity;
// Generated 19 oct. 2017 10:57:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Pays generated by hbm2java
 */
public class Pays  implements java.io.Serializable {


     private String idPays;
     private String nomPays;
     private Set villeses = new HashSet(0);

    public Pays() {
    }

	
    public Pays(String idPays, String nomPays) {
        this.idPays = idPays;
        this.nomPays = nomPays;
    }
    public Pays(String idPays, String nomPays, Set villeses) {
       this.idPays = idPays;
       this.nomPays = nomPays;
       this.villeses = villeses;
    }
   
    public String getIdPays() {
        return this.idPays;
    }
    
    public void setIdPays(String idPays) {
        this.idPays = idPays;
    }
    public String getNomPays() {
        return this.nomPays;
    }
    
    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }
    public Set getVilleses() {
        return this.villeses;
    }
    
    public void setVilleses(Set villeses) {
        this.villeses = villeses;
    }




}


