package mcpr.hellpops_interfaces;

import java.util.Date;
import java.io.Serializable;
import java.util.UUID;

public class Jeton implements Serializable {
    private final Date dateExpiration;
    private final String valeur;
    private final String username;
    private final Role role;


    public Jeton(Date dateExpiration, String username, Role role) {
        this.dateExpiration = dateExpiration;
        this.username = username;
        this.role = role;
        this.valeur = UUID.randomUUID().toString();
    }


    public Date getDateExpiration() {
        return dateExpiration;
    }

    public Role getRole() {
        return role;
    }

    public String getUsername() {
        return username;
    }

    public String getValeur() {
        return valeur;
    }


}
