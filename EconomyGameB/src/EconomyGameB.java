

import java.util.Scanner;


public class EconomyGameB {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
         
         int a = 0;
         int b = 0;
         int c = 0;
         
         int va = 1234567;
         int vb = 123456;
         int vc = 1234;
         
         int remA = n;
         int remB = n;
         int remC = n;
                  
         
         while(remA != 0 && remB != 0 && remC != 0)
         {
                 
                
                 remB = remC;
                 b = 0;
             while(remA != 0 && remB != 0 && remC != 0)
             {
                
                 remA = remB;
                 a = 0;
                 while(remA != 0 && remB != 0 && remC != 0)
                 {
                     if(remA % va == 0) { a = remA / va; remA = 0; }
                     else break;
                 }
                 b++;
                 remB -=  vb;
                 if(remB < 0) break;
                 
             }
              c++;
              remC -=  vc;
             if(remC < 0) break;
             
         }
         
         
         if(remA == 0 || remB == 0 || remC ==0 || n == 0)System.out.println("Yes");
         else System.out.println("No");
         
    }
    
}

