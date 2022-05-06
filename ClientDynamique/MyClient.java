import java.rmi.*;
import java.util.Scanner;

public class MyClient{
    public MyClient () {
        try{
            fabrique X=(fabrique)Naming.lookup("rmi://localhost:1099/Fabrique");

            // determination de la taille des matrices
            System.out.println("saisier la taille de la matrice:");
            Scanner scanner= new Scanner(System.in);
            int n= scanner.nextInt();
            
            // creation des deux matrices
            System.out.println("saisir la matrice 1:");
            int[][] M1 = new int[n][n];
            for(int i=0;i<n ;i++)
                for(int j=0;j<n ;j++)
                    M1[i][j]= scanner.nextInt();

            System.out.println("saisir la matrice 2:");
            int[][] M2 = new int[n][n];
            for(int i=0;i<n ;i++)
                for(int j=0;j<n ;j++)
                    M2[i][j]= scanner.nextInt();
            
            scanner.close();
            
            // creation de la matrice resultat
            int[][] M= new int[n][n];
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++)
                    M[i][j] = X.newMultiplica(i,j).produit(M1, M2, n);
            
            // affichage du resultat
            System.out.println("resultat:");
            for(int i=0;i<n ;i++){
                for(int j=0;j<n ;j++){
                    System.out.print(M[i][j]+" ");
                }
                System.out.print("\n");
            }
        }
        catch(Exception e){
            System.out.println("client: "+e);
        }
    }
}
