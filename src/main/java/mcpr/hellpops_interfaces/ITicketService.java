package mcpr.hellpops_interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;



public interface ITicketService extends Remote {

	public void creerIncident() throws RemoteException;

	public void consulterIncident() throws RemoteException;

	public void accesService() throws RemoteException;

}
