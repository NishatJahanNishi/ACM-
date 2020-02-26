
package codeforce;

import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
         int n=sc.nextInt();
        
        int c=0;
        int sum=0;
        
        for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            sum=b+(sum-a);
           if(sum>c){
           c=sum;}
           
        }
        
       
        System.out.println(c);
        
    }
    
}
