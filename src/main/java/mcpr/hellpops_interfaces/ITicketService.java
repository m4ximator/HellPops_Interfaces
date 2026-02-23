package mcpr.hellpops_interfaces;

import mcpr.helpops_serveurIncident.Incident;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface ITicketService extends Remote {

	String creerIncident(Jeton jeton, String categorie, String titre, String Description) throws RemoteException;

	List<Incident> consulterListeIncident(Jeton jeton) throws RemoteException;

	Incident consulterIncident(Jeton jeton, int id) throws RemoteException;

}
