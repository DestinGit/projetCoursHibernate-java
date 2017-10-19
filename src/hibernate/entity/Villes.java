package hibernate.entity;
// Generated 19 oct. 2017 10:57:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Villes generated by hbm2java
 */
public class Villes  implements java.io.Serializable {


     private String cp;
     private Pays pays;
     private String nomVille;
     private String site;
     private String photo;
     private Set vendeurses = new HashSet(0);
     private Set vendeursVilleses = new HashSet(0);
     private Set clientses = new HashSet(0);

    public Villes() {
    }

	
    public Villes(String cp, Pays pays, String nomVille) {
        this.cp = cp;
        this.pays = pays;
        this.nomVille = nomVille;
    }
    public Villes(String cp, Pays pays, String nomVille, String site, String photo, Set vendeurses, Set vendeursVilleses, Set clientses) {
       this.cp = cp;
       this.pays = pays;
       this.nomVille = nomVille;
       this.site = site;
       this.photo = photo;
       this.vendeurses = vendeurses;
       this.vendeursVilleses = vendeursVilleses;
       this.clientses = clientses;
    }
   
    public String getCp() {
        return this.cp;
    }
    
    public void setCp(String cp) {
        this.cp = cp;
    }
    public Pays getPays() {
        return this.pays;
    }
    
    public void setPays(Pays pays) {
        this.pays = pays;
    }
    public String getNomVille() {
        return this.nomVille;
    }
    
    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }
    public String getSite() {
        return this.site;
    }
    
    public void setSite(String site) {
        this.site = site;
    }
    public String getPhoto() {
        return this.photo;
    }
    
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public Set getVendeurses() {
        return this.vendeurses;
    }
    
    public void setVendeurses(Set vendeurses) {
        this.vendeurses = vendeurses;
    }
    public Set getVendeursVilleses() {
        return this.vendeursVilleses;
    }
    
    public void setVendeursVilleses(Set vendeursVilleses) {
        this.vendeursVilleses = vendeursVilleses;
    }
    public Set getClientses() {
        return this.clientses;
    }
    
    public void setClientses(Set clientses) {
        this.clientses = clientses;
    }




}


