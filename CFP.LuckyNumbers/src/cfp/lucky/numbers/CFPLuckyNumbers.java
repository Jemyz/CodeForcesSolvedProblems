package cfp.lucky.numbers;

import java.util.Scanner;

public class CFPLuckyNumbers {

   
    public static void main(String[] args) {
       
          Scanner scanner = new Scanner(System.in);
          StringBuilder  number =  new StringBuilder(scanner.nextLine().trim());

          StringBuilder  luckynumber =  new StringBuilder("");
          StringBuilder  temp =  new StringBuilder("");
         
          int k = 0, j = 0 , l = 0;          
                 
          for(int i = 0 ; i < number.length()/2 ; i++ )
          {
              if(number.charAt(i) > '7') 
              {
                  number.insert(0, '1'); 
                  break;
              }
              else if ( number.charAt(i) == '7') l++;
              else break;
              
          }
          
         if(l == number.length()/2 )
            if(number.charAt(number.length()/2) > '3') number.insert(0, '1');
         
         if(number.length()%2 != 0) number.insert(0, '1');

         j = k = number.length()/2;
        
         for(int i = 0 ; i < number.length()  ; i++)
        {
            temp = new StringBuilder("");
            if(j <= 0)break;
            if(k <= 0)break;
               
           if(number.charAt(i) < '4')
           {
               
            luckynumber.insert(luckynumber.length(), '4');
              j--;
              break;
           }
           else if(number.charAt(i) == '4')
           {
               for(int m = number.length()-1 ; m > i ; m--)temp.insert(temp.length(), '7');
               if(number.charAt(i+1) > '7' || (number.substring(i+1).equals(temp.toString().trim()) && j != 1))
               {
                   luckynumber.insert(luckynumber.length(), '7');
                   k--;
                   break;
               }
            luckynumber.insert(luckynumber.length(), '4');
            j--;
           }
           else if(number.charAt(i) < '7')
           {
               
            luckynumber.insert(luckynumber.length(), '7');
              k--;
              break;
           }
           else if(number.charAt(i) == '7')
           {
            luckynumber.insert(luckynumber.length(), '7');
               k--;
           }


        }
        
        
        for(int i = 0 ; i < j  ; i++)
        {           
            luckynumber.insert(luckynumber.length(), '4');
        }
        
         for(int i = 0 ; i < k  ; i++)
        {           
            luckynumber.insert(luckynumber.length(), '7');
        }
        
        System.out.println(luckynumber);
         
    }
    
    
}
