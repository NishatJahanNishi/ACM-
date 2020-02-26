
package codeforce;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Equal_Rectangles {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int q=sc.nextInt();
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < q; i++) {
            int n=sc.nextInt();
            int []a=new int[4*n];
            for (int j = 0; j < 4*n; j++) {
                a[j]=sc.nextInt();
                int x = a[j];

                if (mp.containsKey(x)) {
                    mp.put(x, mp.get(x) + 1);
                } else {
                    mp.put(x, 1);
                }
                }
    Arrays.sort(a);
     boolean flag = false;


            for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
                int tt = entry.getValue();

                if (tt % 2 != 0) { 

                    flag = true;
                    break;
                }
            }
    HashSet<Integer> h = new HashSet<Integer>();
           int b=0;
            for (int j = 0, k=4*n-1;j<k;j+=2,k-=2) {
                 b=a[j]*a[k];
                 h.add(b);
                         
                 }
            
                
                if(h.size()==1 && flag==false){
                    System.out.println("YES");}
                else{
                    System.out.println("NO");}
            
        
                
    }}}
    

