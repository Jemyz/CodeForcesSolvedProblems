
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class PhotographerC {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int noOfc = 0;
        
         ArrayList<Node> node = new ArrayList<>();
         
        for (int i = 0; i < n; i++) 
        {
            Node temp =  new Node();
            temp.value  = scanner.nextInt()*a + scanner.nextInt()*b;
            temp.index = i;
            node.add(temp);
        }
        
        Collections.sort(node, new Comparator<Node>(){        
             @Override
             public int compare(Node o1, Node o2) {
                 return o1.value - o2.value;
             }
         });        
         Node x[] =  new Node[node.size()];           
         node.toArray(x);  
         
        for (int i = 0; i < n; i++) 
        {
            d -= x[i].value;
            if(d < 0) break;           
            noOfc++;
        }
        System.out.println(noOfc);
        
        for (int i = 0; i < noOfc; i++) 
        {
            System.out.print(x[i].index+1 + " ");
        }
        
         
        
    }
    private static class Node{
        int value; 
        int index;
    }
    
}
