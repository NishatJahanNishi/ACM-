
package javaapplication15;

import java.util.Scanner;


public class Temparature {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double cels,farn;
        System.out.print("Enter the farn:");
        farn=input.nextDouble();
        cels= 0.56*(farn-32);
        System.out.println("Cels: "+cels);
    }
    
}
