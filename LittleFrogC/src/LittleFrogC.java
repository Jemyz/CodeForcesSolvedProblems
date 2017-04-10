
import java.util.Scanner;


public class LittleFrogC {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int i = 1, j = n;
        
        while(i < j)
        {
            System.out.print(i + " " + j + " ");
            i++;
            j--;
            
        }
        if( i == j) System.out.print(i + " ");

    
    }
    
}
