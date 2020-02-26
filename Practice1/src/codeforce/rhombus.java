
package codeforce;

import java.util.Scanner;

public class rhombus {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,b,y,d;
        
        int a=sc.nextInt();
        
        if(a<2){
            System.out.println("1");
           }
        else if(a==2){
            System.out.println("5");
            
        }
        else if(a>2){
            y=a-2;
        x=(y*(y+1))/2;
        x=x*4;
        b=5+(y*4)+x;
            System.out.println(b);
        }
        
    }
    
}
