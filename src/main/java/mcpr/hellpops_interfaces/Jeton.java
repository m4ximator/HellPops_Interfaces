package mcpr.hellpops_interfaces;

import java.util.Date;

public class Jeton {
	private Date dateExpiration;
	private String valeur;
	
	
	public Jeton(Date dateExpiration, String valeur) {
		this.dateExpiration = dateExpiration;
		this.valeur = valeur;
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
