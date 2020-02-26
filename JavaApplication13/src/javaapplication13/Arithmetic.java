
package javaapplication13;

import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,result;
        System.out.println("Enter the numbers: ");
        a= input.nextInt();
        b=input.nextInt();
        
        result=a+b;
        System.out.println("add: "+result);
        result=a-b;
        System.out.println("sub: "+result);
        result=a*b;
        System.out.println("mul: "+result);
        double result2=(double)a/b;
        System.out.println("div: "+result2);
        result=a%b;
        System.out.println("rem: "+result);
    }
    
}
