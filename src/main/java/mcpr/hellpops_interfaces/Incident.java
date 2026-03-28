package mcpr.hellpops_interfaces;

import java.io.Serializable;
import java.util.Date;

public class Incident implements Serializable {

    private final int identifiant;
    private String titre;
    private String categorie;
    private String description;
    private String etat;
    private final Date dateCreation;
    private final String identifiantCreateur;
    private String agentResponsable;
    private Date DateResolution;
    private String MessageResolution;

    // état de base d'un incident (simplifie les conditions avec une constante)
    public static final String OPEN = "OPEN";

    // état final du ticket lorsqu'il est résolu
    public static final String RESOLVED = "RESOLVED";

    public Incident(int identifiant, String titre, String categorie, String description, String identifiantCreateur) {
        this.identifiant = identifiant;
        this.categorie = categorie;
        this.titre = titre;
        this.description = description;
        this.identifiantCreateur = identifiantCreateur;
        this.agentResponsable = null;
        this.etat = OPEN;
        this.dateCreation = new Date();
    }

    @Override
    public String toString() {
        StringBuilder chaine = new StringBuilder();
        chaine.append("Ticket #").append(identifiant)
                .append(" [").append(etat).append("]")
                .append(" - ").append(titre)
                .append(" (").append(categorie).append(")")
                .append(" --- ").append(dateCreation);

        // On n'affiche l'agent que s'il y en a un !
        if (agentResponsable != null) {
            chaine.append(" --- Assigné à : ").append(agentResponsable);
        }

        return chaine.toString();
    }

    // méthodes getters
    public int getIdentifiant() {
        return identifiant;
    }

    public String getTitre() {
        return titre;
    }

    public String getCategorie() { return categorie; }

    public String getDescription() {
        return description;
    }

    public String getEtat() {
        return etat;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public String getIdentifiantCreateur() {
        return identifiantCreateur;
    }

    public String getAgentResponsable(){return agentResponsable;}

    public Date getDateResolution() {return DateResolution;}

    public String getMessageResolution() {return MessageResolution;}

    // Setters pour la modif du ticket
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setAgentResponsable(String username) {this.agentResponsable=username;}

    public void setEtat(String Etat){this.etat=Etat;}

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateResolution(Date DateResolution) {this.DateResolution = DateResolution;}

    public void setMessageResolution(String MessageResolution) {this.MessageResolution = MessageResolution;}

}
