
package javaapplication15;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
       
        Scanner tusher=new Scanner(System.in);
        int x,y;
        
        System.out.println("Enter the number: ");
        x=tusher.nextInt();
        y=tusher.nextInt();
        x+=y;
        System.out.println("result: "+x);
        x-=y;
        System.out.println("result: "+x);
        x*=y;
        System.out.println("result: "+x);
        x/=y;
        System.out.println("result: "+x);
        x%=y;
        System.out.println("result: "+x);
        
        
        
    }
    
}
