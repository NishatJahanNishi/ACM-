
package javaapplication23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n>=-100 && n<=100){
            String s=Integer.toString(n);
            System.out.println("Good job");
        }
        else{
            System.out.println("Wrong answer");}
    }
    
}
