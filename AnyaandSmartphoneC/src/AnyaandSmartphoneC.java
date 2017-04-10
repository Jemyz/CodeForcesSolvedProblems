
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class AnyaandSmartphoneC {

    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
         
         int n = scanner.nextInt();
         int m = scanner.nextInt();
         int k = scanner.nextInt();
                 
         long noOfg = 0;
         scanner.nextLine();
         
         int a[] = new int[n];
         int b[] = new int[m];
         
         ArrayList<Node> d = new ArrayList<Node>();
         
         for (int i = 0; i < n; i++) 
         {
            a[i] = scanner.nextInt();
            Node t = new Node();
            t.number =  a[i];
            t.index = i;
            
            d.add(t);
         }
         
         for (int i = 0; i < m; i++) 
         {
              b[i] = scanner.nextInt();
         }
         
         
        Collections.sort(d, new Comparator<Node>(){        
             @Override
             public int compare(Node o1, Node o2) {
                 return o1.number - o2.number;
             }
         });        
         Node x[] =  new Node[d.size()];           
         d.toArray(x);  
       
         
         
         
         for (int i = 0; i < m; i++) 
         {
         
           int t1 = bs(x,b[i],0,x.length);                   
           int t = x[t1].index;
                                
           noOfg += t/k + 1;      
           if(t != 0)
           {
                int t2 = bs(x,a[t-1],0,x.length);
                int temp;
                temp = x[t1].index;
                x[t1].index = x[t2].index;
                x[t2].index = temp;
                
                temp = a[t];
                a[t] = a[t-1];
                a[t-1] = temp;
                
           }
                         
         }
           
         
         
        System.out.println(noOfg);
         
       
    }
    
  static int bs (Node []a , int key , int i1 , int i2)
  {
      int i = (i1 + i2)/2;
      if (key == a[i].number) return i;
      else if(key < a[i].number)
      {          
         return bs(a,key,i1,i);
      }
      else if(key > a[i].number)
      {
         return bs(a,key,i+1,i2);
      }
      return -1;
  }
    
    private static class Node{
        int number; 
        int index;
    }
    
}
