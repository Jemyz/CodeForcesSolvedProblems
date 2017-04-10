
import java.util.Scanner;

public class ChatOnlineB {
    
    public static void main(String[] args) {
         
     
        Scanner scanner = new Scanner(System.in);
        
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        
        int startp [] = new int[p];
        int endp [] = new int[p];
        int startq [] = new int[q];
        int endq [] = new int[q];
        
        int noOfint = 0 ;
        
        for(int i = 0 ; i < p ; i++)
        {
            startp[i] = scanner.nextInt();
            endp[i] = scanner.nextInt();
        }
        for(int i = 0 ; i < q ; i++)
        {
            startq[i] = scanner.nextInt();
            endq[i] = scanner.nextInt();
        }
        
        
         for(int k = l ; k <= r ; k++)
            {
           for(int i = 0 ; i < p ; i++)
             {
                for(int j = 0 ; j < q ; j++)
                {
                   
       
                    if((startq[j] + k >= startp[i] && startq[j] + k  <= endp[i]) || (endq[j] + k >= startp[i]  && endq[j] + k  <= endp[i]) || (startq[j] + k <= startp[i]  && endq[j] + k  >= endp[i]))
                    { 
                        noOfint++;                        
                        i = p;
                        j = q;
                    }
                }
             }
        }
        
     
        System.out.println(noOfint);
        
    }
    
}
