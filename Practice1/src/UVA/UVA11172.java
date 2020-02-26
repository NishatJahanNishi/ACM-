
package UVA;

import java.util.Scanner;

public class UVA11172 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,a,b;
               
        x=sc.nextInt();
        
        
        for (int i = 1; i <=x; i++) {
            
            a=sc.nextInt();
        b=sc.nextInt();
        
             System.out.printf("%c\n", a > b ? '>' : a < b ? '<' : '=');}
           
        
        
    
}}
    

