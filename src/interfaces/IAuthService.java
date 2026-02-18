package commun.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IAuthService extends Remote {

	public void inscription() throws RemoteException;

	public void connexion() throws RemoteException;

	public void deconnexion() throws RemoteException;

	public void delivrerJeton() throws RemoteException;

}
