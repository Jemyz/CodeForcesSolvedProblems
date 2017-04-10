package cfp.pkg71a;



import java.util.Scanner;


public class CFP71A {

  
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String words[] = new String[n]; 
        
        for(int i = 0 ; i < n ; i++)  words[i] = scanner.nextLine();
        
        for(int i = 0 ; i < n ; i++)
        {
            if(words[i].length() > 10) words[i] = words[i].charAt(0) + Integer.toString( words[i].length() - 2) + words[i].charAt(words[i].length() - 1);
            System.out.println(words[i]);
        }
    }
    
}
