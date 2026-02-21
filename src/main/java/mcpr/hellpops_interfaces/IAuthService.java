package mcpr.hellpops_interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IAuthService extends Remote {

	public void inscription(String username, String passwd) throws RemoteException;

	public Jeton connexion(String username, String passwd) throws RemoteException;

	public void deconnexion() throws RemoteException;

	public boolean estValide (Jeton jeton) throws RemoteException;

}
