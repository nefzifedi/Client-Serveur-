
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RMISecurityManager;
import java.util.Properties;
import java.rmi.server.RMIClassLoader;


public class dynamicserver {
    public static void main(String[] args) {
        System.setSecurityManager(new RMISecurityManager());
        try{
            Properties p= System.getProperties();
            String url=p.getProperty("java.rmi.server.codebase");
            Class ClasseServeur = RMIClassLoader.loadClass(url, "fabriqueRemote");
            Naming.rebind("rmi://localhost:1099/Fabrique",(Remote)ClasseServeur.newInstance());
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
