
import java.util.Scanner;

public class YoungPhysicist {
    
    public static void main(String[] args) {
         
     
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());  
        int sumx = 0;
        int sumy = 0;
        int sumz = 0; 
        
        String vectors [] = new String[n];
        String[]temp;
        for(int i = 0; i < n ; i++)
        {
            vectors[i] = scanner.nextLine().trim();
        }
        for(int i = 0; i < n ; i++)
        {
            temp = vectors[i].split(" ");
            sumx += Integer.parseInt(temp[0]); 
            sumy += Integer.parseInt(temp[1]); 
            sumz += Integer.parseInt(temp[2]); 
        }
        if(sumx == 0 && sumy == 0  && sumz == 0) System.out.println("YES");
        else System.out.println("NO");
        
        
    }
    
}
