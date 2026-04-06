package mcpr.hellpops_interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ISupervision extends Remote {

    void recevoirEvenement (String message) throws RemoteException;
}
