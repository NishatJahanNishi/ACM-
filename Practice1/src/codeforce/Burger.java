
package codeforce;

import java.util.Scanner;

public class Burger {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        int q=sc.nextInt();
        for (int i = 0; i < q; i++) {
            int bun=sc.nextInt();
            int beef=sc.nextInt();
            int chicken=sc.nextInt();
            int beef_price=sc.nextInt();
            int chicken_price=sc.nextInt();
            
            
            if(beef_price<=chicken_price){
            int total=0;
            total=chicken_price*Math.min(bun/2, chicken);
            bun-=(2*chicken);
            if(bun>0){
            total=total+beef_price*Math.min(bun/2, beef);}
                System.out.println(total);}
            
           else{
            int total=0;
            total=beef_price*Math.min(bun/2, beef);
            bun-=(2*beef);
            if(bun>0){
            total=total+chicken_price*Math.min(bun/2, chicken);}
               System.out.println(total);} 
            
            
        }
    }
    
}
