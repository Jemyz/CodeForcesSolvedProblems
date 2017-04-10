
import java.util.Scanner;

public class AmrandPins {
    
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String [] temp = scanner.nextLine().split(" ");
        
        int r = Integer.parseInt(temp[0]);
        double x1 = Integer.parseInt(temp[1]);
        double y1 = Integer.parseInt(temp[2]);
        double x2 = Integer.parseInt(temp[3]);
        double y2 = Integer.parseInt(temp[4]);
        double path = Math.sqrt((double)((x2-x1)*(x2-x1)) + (double)( (y2-y1)*(y2-y1)));
        int numOfsteps = 0;

        if(path != 0)
        {
        while(path > 2*r)
        {
            path -=  2*r;
            numOfsteps++;
        }
        numOfsteps++;
        }
        System.out.println(numOfsteps);
        
     }
    
}
