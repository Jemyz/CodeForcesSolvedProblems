
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class FruitsC {

    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int price[] = new int[n];
        int list[] = new int[m];
        
        long best = 0;
        long worst = 0;
        int c = 0;
        
        HashMap<String,Integer> hm = new HashMap<>();                  
        for (int i = 0; i < n; i++) 
        {
            price[i] = scanner.nextInt();
        }
        scanner.nextLine();
        for (int i = 0; i < m; i++) 
        {
         
            String t = scanner.nextLine().trim();
            if(hm.containsKey(t))
            {
                
                list[hm.get(t)]++;
            }
            else
            {
                c++;
                hm.put(t,i);
                list[i]++ ; 
            }
                         
        }
        
        Arrays.sort(price);
        Arrays.sort(list);
        
       
        
        for (int i = 0; i < m; i++) 
        {
            if(c == i)break;
            best += price[i]*list[m-1-i];
            worst += price[n-1-i]*list[m-1-i];
                    
        }
        System.out.println(best + " " + worst);
        
    }

}
