
package array;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist1 {
    public static void main(String[] args) {
         ArrayList <Integer> num=new ArrayList<Integer>();
         num.add(10);
         num.add(20);
         num.add(30);
         num.add(3,40);
         
         Iterator a=num.iterator();
         while(a.hasNext()){
             System.out.print(" "+a.next());
         }
         System.out.println();
         
         System.out.println("Size: "+num.size());
         num.remove(2);
         System.out.print(" "+num);
    }
    
}
