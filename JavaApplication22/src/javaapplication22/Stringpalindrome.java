
package javaapplication22;

import java.util.Scanner;

public class Stringpalindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s1=input.nextLine();
        
        StringBuffer sb=new StringBuffer(s1);
        String s2=sb.reverse().toString();
        
        if(s1.equals(s2)){
            System.out.println("palindrome");}
        else{
            System.out.println("not palindrome");}
        
    }
    
}
