
import java.util.Scanner;

public class FlagDayB {

    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[] dancer = new int[n];
        int[] A = new int[m];
        int[] B = new int[m];
        int[] C = new int[m];

        for(int i = 0 ; i < m ; i++)
        {
            A[i] = scanner.nextInt()-1;
            B[i] = scanner.nextInt()-1;
            C[i] = scanner.nextInt()-1;
        }
        
        
        for(int i = 0 ; i < m ; i++)
        {
           if(dancer[A[i]] == 0 || dancer[A[i]] == 1) dancer[A[i]] = 1;
           else if (dancer[A[i]] == 2)
           {
               dancer[B[i]] = 1;
               dancer[C[i]] = 3;
               continue;
           }
           else
           {
               dancer[B[i]] = 1;
               dancer[C[i]] = 2;
               continue;
           }
           
           
           if(dancer[B[i]] == 0 || dancer[B[i]] == 2) dancer[B[i]] = 2;
           else if (dancer[B[i]] == 1)
           {
               dancer[A[i]] = 2;
               dancer[C[i]] = 3;
               continue;
           }
           else
           {
               dancer[A[i]] = 1;
               dancer[C[i]] = 2;
               continue;
           }
            
           if(dancer[C[i]] == 0 || dancer[C[i]] == 3) dancer[C[i]] = 3;
           else if (dancer[C[i]] == 1)
           {
               dancer[A[i]] = 3;
               dancer[B[i]] = 2;               
               continue;
           }
           else
           {   
               dancer[A[i]] = 1;
               dancer[B[i]] = 3;
               continue;
           }
        }
        
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(dancer[i] + " ");
        }
        
    }
    
}
