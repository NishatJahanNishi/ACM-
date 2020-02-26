
package javaapplication17;

import java.util.Scanner;


public class Vowel {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch;
        System.out.println("Enter the alphabet:");
        ch=input.next().charAt(0);
        if(ch=='a'){
            System.out.println("Vowel");}
        else if(ch=='e'){
            System.out.println("Vowel");}
        else if(ch=='i'){
            System.out.println("Vowel");}
        else if(ch=='o'){
            System.out.println("Vowel");}
        else if(ch=='u'){
            System.out.println("Vowel");}
        else{
            System.out.println("Consonent");}
    }
    
}
