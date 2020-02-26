
package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Sortarraylist {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       
        ArrayList<Integer> num=new ArrayList<Integer>();
        
            
        
        
        num.add(10);
        num.add(-3);
        num.add(4);
        num.add(100);
        num.add(0);
        
        Collections.sort(num);
        System.out.println(num);
        Collections.sort(num,Collections.reverseOrder());
        System.out.println(num );
        
        
    }
    
}
