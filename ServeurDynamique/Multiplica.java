
import java.rmi.*;


public interface Multiplica extends Remote{
public int produit(int[][] M1,int[][] M2, int n) throws RemoteException;
}
