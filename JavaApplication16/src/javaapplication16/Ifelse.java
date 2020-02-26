
package javaapplication16;

import java.util.Scanner;


public class Ifelse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.print("Enter the number:");
        num=input.nextInt();
        if(num>0){
            System.out.println("pos");}
        else if(num<0){
            System.out.println("neg");}
        else{
            System.out.println("Zero");}
    }
    
}
