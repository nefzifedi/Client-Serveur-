import java.rmi.RMISecurityManager;
import java.rmi.server.RMIClassLoader;
import java.util.Properties;

public class dynamicclient{
    public dynamicclient() throws Exception{
        Properties p = System.getProperties();
        String url = p.getProperty("java.rmi.server.codebase");
        Class ClasseClient = RMIClassLoader.loadClass(url, "MyClient");
        ClasseClient.newInstance();
        //MyClient obj= new MyClient();
       //Constructor [] C = ClasseClient.getConstructors();
       //C[0].newInstance(new Object[]{args}); 
    }  

    public static void main(String[] args) {
        System.setSecurityManager(new RMISecurityManager());
        try{
            dynamicclient cli = new dynamicclient();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
