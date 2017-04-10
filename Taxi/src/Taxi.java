
import java.util.Scanner;
import java.util.Arrays;


public class Taxi {
    
     public static void main(String[] args) {
         
     
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        
        String [] temp = scanner.nextLine().split(" ");
        
        int[]groups = new int[n];
        
        int noOftaxes = 0;
        
       for(int i = 0 ; i < n ; i++)
       {
           groups[i] = Integer.parseInt(temp[i]);
       }
       
       Arrays.sort(groups);
       
       int i = 0;
       int j = n-1;
       
       while(j > i)
       {
            if(groups[j] == 4)
            {
                 noOftaxes++;
                 j--;
            }
            else if(groups[j] == 3)
            {
               if( groups[i] == 1) i++;
                noOftaxes++;
                j--;
            }
            else if(groups[j] == 2)
            {
               if( groups[j-1] == 2) j-=2;
               else j-=3;
                noOftaxes++;        
            }
            else
            {
                noOftaxes += Math.ceil((j-i+1)/4.0);
                j=0; i=n;
            }
            
       }
       if(j == i){ noOftaxes++;}

       
        System.out.println(noOftaxes);

       
       
     }
       
}
    

