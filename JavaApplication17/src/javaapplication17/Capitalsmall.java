
package javaapplication17;

import java.util.Scanner;

public class Capitalsmall {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch;
        System.out.println("Enter an alphabet:");
        ch=input.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("capital");}
        else if(ch>='a' && ch<='z'){
            System.out.println("small");}
        
    }
    
}
