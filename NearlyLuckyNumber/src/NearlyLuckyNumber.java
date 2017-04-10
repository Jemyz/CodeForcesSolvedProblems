
import java.util.Scanner;

public class NearlyLuckyNumber {
     public static void main(String[] args) {
         
     
        Scanner scanner = new Scanner(System.in);

        char[] number = scanner.nextLine().trim().toCharArray();
        int sum = 0;
        
        for(int i = 0; i < number.length ; i++)
        {
            if(number[i] == '4' ||  number[i] == '7')sum++;
        }
        
          if(sum == 4 || sum == 7) System.out.println("YES");
          else System.out.println("NO");
     }
    
}
