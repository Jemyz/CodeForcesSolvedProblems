
import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
         
     
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine().trim().toLowerCase();
        
        StringBuilder newNumber =  new StringBuilder("");
        
        for(int i = 0; i < number.length() ; i++)
        {
           if(number.charAt(i) != 'a' && number.charAt(i) != 'o' &&  number.charAt(i) != 'y' && number.charAt(i) != 'e' && number.charAt(i) != 'u' && number.charAt(i) != 'i' )
           {
               newNumber.insert(newNumber.length(), '.');
               newNumber.insert(newNumber.length(), number.charAt(i));
           }
           
        }
        
         System.out.println(newNumber);
        
        
    }
    
}
