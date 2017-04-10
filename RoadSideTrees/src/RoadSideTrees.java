
import java.util.Scanner;


public class RoadSideTrees {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []TreesHeight = new int[n];
        
        for(int i = 0 ; i < n ; i++)  TreesHeight[i] = scanner.nextInt();
        int totaltime = 0;
        int currentheight = 0;
        totaltime += Math.abs(TreesHeight[0] - currentheight) + 1;
            currentheight = TreesHeight[0];
        
        for(int i = 1 ; i < n ; i++)
        {
            
               totaltime += Math.abs(TreesHeight[i] - currentheight) + 2;
               currentheight = TreesHeight[i];
            
        }
        System.out.println(totaltime);
    }
    
}
