
import java.rmi.*;
import java.rmi.server.*;


public class fabriqueRemote extends UnicastRemoteObject implements fabrique {
    private static final long serialVersionUID = 7526472295622776147L; 
    
    public fabriqueRemote() throws RemoteException{
        super();
    }
    public Multiplica newMultiplica(int i, int j) throws RemoteException {
        return new MultiplicaRemote(i,j);
    }
}
