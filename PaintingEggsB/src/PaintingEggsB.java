
import java.util.Scanner;
import java.util.Arrays;



public class PaintingEggsB {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] D = new int[n];
        int[] A = new int[n];
        int[] G = new int[n];
        int TA = 0;
        int TG = 0;
        
        StringBuilder ans = new StringBuilder();
        ans.setLength(n);
        
       
        for(int i = 0 ; i < n ; i++)
        {
            
            A[i] = scanner.nextInt();
            G[i] = scanner.nextInt();
            

            
            D[i] = (A[i] - G[i])*1000000;
            if(D[i] > 0) D[i] += i;
            else D[i] -= i;
            
        }
        
       
        
        
        
        for(int i = 0 ; i < n ; i++)
        {
            int num = Math.abs(D[i] % 1000000);
            if(A[num] + TA - TG < 500)
            {
                TA += A[num];
                ans.setCharAt(num, 'A');
                
            }
            else
            {
                TG += G[num];
                ans.setCharAt(num, 'G');
            }
            
            
        }
       
        System.out.println(ans);

        
        

    }

    
}
