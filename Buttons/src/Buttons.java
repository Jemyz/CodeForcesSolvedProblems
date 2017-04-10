
import java.util.Scanner;

public class Buttons {
    
      public static void main(String[] args) {
         
     
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        
        for(int i = n - 1 ; i > 0 ; i--)
        {
            sum = sum + i * (n-i) + 1;
        }
        sum++;
        
          System.out.println(sum);
      }
    
}
