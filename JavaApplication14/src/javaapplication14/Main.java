/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,result;
        System.out.println("Enter the numbers: ");
        a= input.nextInt();
        b=input.nextInt();
        
        result=a+b;
        System.out.println("add: "+result);
        
    }
    
}
