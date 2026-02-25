package mcpr.hellpops_interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IAuthService extends Remote {

	boolean inscription(String username, String passwd) throws RemoteException;

	Jeton connexion(String username, String passwd) throws RemoteException;

	void deconnexion(Jeton jeton) throws RemoteException;

	boolean estValide (Jeton jeton) throws RemoteException;

	String getLoginParJeton(Jeton jeton) throws RemoteException;

}
