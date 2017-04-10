
import java.util.Scanner;

public class TicTacToeC {

   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        char grid[][] = new char[3][3];
        grid[0] = scanner.nextLine().toCharArray();
        grid[1] = scanner.nextLine().toCharArray();
        grid[2] = scanner.nextLine().toCharArray();
        
        int n = 3;
        int noOfx = 0;
        int noOfo = 0;
        int noOfc = 0;
        Boolean wonX = false;
        Boolean wonO = false;
        
       for(int i = 0 ; i < n ; i++)
       {
           for (int j = 0; j < n; j++)
           {
               if(grid[i][j] == 'X')noOfx++;
               else if (grid[i][j] == '0')noOfo++;
               else noOfc++;
           }
       }
       
     
      
        if(grid[0][0] == grid[0][1] && grid[0][0] == grid[0][2] && grid[0][0] != '.') 
        {
            if(grid[0][0] == 'X')
            {
                wonX = true;
            }
            else 
            {
                wonO = true;
            }

        }

         if(grid[1][0] == grid[1][1] && grid[1][0] == grid[1][2] && grid[1][0] != '.')
        {
            if(grid[1][0] == 'X')
            {
                wonX = true;
            }
            else 
            {
                wonO = true;
            }
        }

         if(grid[2][0] == grid[2][1] && grid[2][0] == grid[2][2] && grid[2][0] != '.')
        {
            
            if(grid[2][0] == 'X')
            {
                wonX = true;
            }
            else 
            {
                wonO = true;
            }

        }

         if(grid[0][0] == grid[1][0] && grid[0][0] == grid[2][0] && grid[0][0] != '.')
        {
            if(grid[0][0] == 'X')
            {
                wonX = true;
            }
            else 
            {
                wonO = true;
            }
        }

         if(grid[0][1] == grid[1][1] && grid[0][1] == grid[2][1] && grid[0][1] != '.')
        {
            if(grid[0][1] == 'X')
            {
                wonX = true;
            }
            else 
            {
                wonO = true;
            }
        }

         if(grid[0][2] == grid[1][2] && grid[0][2] == grid[2][2] && grid[0][2] != '.')
        {
            if(grid[0][2] == 'X')
            {
                wonX = true;
            }
            else 
            {
                wonO = true;
            }
        }

         if(grid[0][0] == grid[1][1] && grid[0][0] == grid[2][2] && grid[0][0] != '.')
        {
            if(grid[0][0] == 'X')
            {
                wonX = true;
            }
            else 
            {
                wonO = true;
            }
        }

        if(grid[0][2] == grid[1][1] && grid[0][2] == grid[2][0] && grid[0][2] != '.')
        {
            if(grid[0][2] == 'X')
            {           
                wonX = true;
            }
            else 
            {                
                wonO = true;
            }
        }
           
      
        
       if((noOfx- noOfo != 0 && noOfx- noOfo != 1) || (wonX == true && wonO == true) || (wonO && noOfo != noOfx) || (wonX && noOfo + 1 != noOfx) )
       {
           System.out.println("illegal");
       }
            
            
       else if (!wonX  && !wonO && noOfc == 0) System.out.println("draw");
       
       else if (wonX || wonO)
       {
           if(wonX) System.out.println("the first player won");
           else  System.out.println("the second player won");
       }
           
       else
       {
           if(noOfx - noOfo == 1)System.out.println("second");
           else if (noOfx - noOfo == 0)System.out.println("first");
       }
       
        
    }
    
}
