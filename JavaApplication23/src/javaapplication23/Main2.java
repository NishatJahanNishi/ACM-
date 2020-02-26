
package javaapplication23;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        StringBuffer sb=new StringBuffer(A);
        
        String s2=sb.reverse().toString();
        if(A.equals(s2)){
            System.out.println("Yes");}
        else{
            System.out.println("No");}
    }
    
}
