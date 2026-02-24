package mcpr.hellpops_interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface ITicketService extends Remote {

	String creerIncident(Jeton jeton, String categorie, String titre, String Description) throws RemoteException;

	List<Incident> consulterListeIncident(Jeton jeton) throws RemoteException;
	
	Incident consulterIncidentDetail(Jeton jeton, int id) throws RemoteException;

	Incident modifierIncident(Jeton jeton, int id, String categorie, String titre, String description) throws RemoteException;

}
