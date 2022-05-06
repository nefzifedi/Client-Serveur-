import java.rmi.*;
import java.rmi.server.*;

public class MultiplicaRemote extends UnicastRemoteObject implements Multiplica{
    private static final long serialVersionUID = 7526472295622776147L; 
    
    int i=0,j=0;

    public MultiplicaRemote(int i, int j) throws RemoteException{
        super();
        this.i=i;
        this.j=j;
    }
    
    public int produit(int[][] M1,int[][] M2, int n) throws RemoteException {
        int s=0;
        for(int k=0; k<n ;k++)
            s+=M1[i][k]*M2[k][j];
        return(s);    
    }
}
