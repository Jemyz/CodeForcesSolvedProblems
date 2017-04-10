
import java.util.Scanner;


public class DZYLovesChessboard {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String [] temp = scanner.nextLine().split(" ");
        
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);
        char[][] chessboard = new char[n][m];

        
        
        for(int i = 0 ; i < n ; i++)  chessboard[i] = scanner.nextLine().toCharArray();        
        char b = 'B';
        char w = 'W';
        char r = b;
        char c = b;
        for(int i = 0 ; i < n ; i++)
        {
            r = c;
            for(int j = 0 ; j < m ; j++)
            {
                if(chessboard[i][j] == '-') System.out.print("-");
                else   System.out.print(r);
                if(r == b)r = w;
                else r = b;

            }
                if(c == b)c = w;
                else c = b;
            System.out.println("");
        }

        
    }
    
}
