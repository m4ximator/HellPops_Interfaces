package mcpr.hellpops_interfaces;

import java.util.Date;
import java.io.Serializable;
import java.util.UUID;

public class Jeton implements Serializable {
    private Date dateExpiration;
    private String valeur;


    public Jeton(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
        this.valeur = UUID.randomUUID().toString();
    }


    public Date getDateExpiration() {
        return dateExpiration;
    }


    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }


    public String getValeur() {
        return valeur;
    }


    public void setValeur(String valeur) {
        this.valeur = valeur;
    }


}
