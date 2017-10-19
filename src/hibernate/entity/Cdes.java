package hibernate.entity;
// Generated 19 oct. 2017 10:57:18 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cdes generated by hbm2java
 */
public class Cdes  implements java.io.Serializable {


     private Integer idCde;
     private Clients clients;
     private Date dateCde;
     private Set ligcdeses = new HashSet(0);

    public Cdes() {
    }

	
    public Cdes(Clients clients, Date dateCde) {
        this.clients = clients;
        this.dateCde = dateCde;
    }
    public Cdes(Clients clients, Date dateCde, Set ligcdeses) {
       this.clients = clients;
       this.dateCde = dateCde;
       this.ligcdeses = ligcdeses;
    }
   
    public Integer getIdCde() {
        return this.idCde;
    }
    
    public void setIdCde(Integer idCde) {
        this.idCde = idCde;
    }
    public Clients getClients() {
        return this.clients;
    }
    
    public void setClients(Clients clients) {
        this.clients = clients;
    }
    public Date getDateCde() {
        return this.dateCde;
    }
    
    public void setDateCde(Date dateCde) {
        this.dateCde = dateCde;
    }
    public Set getLigcdeses() {
        return this.ligcdeses;
    }
    
    public void setLigcdeses(Set ligcdeses) {
        this.ligcdeses = ligcdeses;
    }




}


