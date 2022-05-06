import java.rmi.*;


public interface fabrique extends Remote{
    public Multiplica newMultiplica(int i,int j) throws RemoteException ;
}
