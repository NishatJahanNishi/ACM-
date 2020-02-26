
package javaapplication18;

import java.util.Scanner;

public class Condition{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,large;
        System.out.print("Enter the numbers: ");
        a=input.nextInt();
        b=input.nextInt();
        large=(a>b)?a:b;
        System.out.println(large);
        
    }
        
    
}
