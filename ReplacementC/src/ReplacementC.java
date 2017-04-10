
import java.util.Scanner;


public class ReplacementC {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int r = 0;
        
        scanner.nextLine();
        
        
        StringBuilder s = new StringBuilder(scanner.nextLine().trim());
        
        for (int i = 0; i < n-1; i++) 
        {
           if(s.charAt(i) == '.' && s.charAt(i + 1) == '.')
                {
                    
                    r++;
                    
                }
        }
        
        int d[] = new int[m];
        
        for (int i = 0; i < m; i++) 
        {
            int t = scanner.nextInt()-1;
            char bc = s.charAt(t);
            char c = scanner.nextLine().trim().charAt(0);
            s.setCharAt(t,c);
            
            if( c == '.')
            {
                if(bc != '.')
                {
                    if(t != n-1 && s.charAt(t+1) == '.') r++;
                    if(t != 0 && s.charAt(t-1) == '.') r++;
                }
                
            }
            else
            {
                if(bc == '.')
                {
                     if(t != n-1 && s.charAt(t+1) == '.') r--;
                     if(t != 0 && s.charAt(t-1) == '.') r--;
                }
               
            }
            
            
           d[i] = r;
        }
        
        
        for (int i = 0; i < m ;i++) {
            System.out.println(d[i]);
        }
                
    }
    
}
