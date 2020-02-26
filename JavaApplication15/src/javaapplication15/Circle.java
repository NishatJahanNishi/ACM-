
package javaapplication15;

import java.util.Scanner;


public class Circle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double r,area;
        System.out.print("Enter the radius:");
        r=input.nextDouble();
        area=3.14*r*r;
        System.out.println("Area: "+area);
        
        
    }
    
}
