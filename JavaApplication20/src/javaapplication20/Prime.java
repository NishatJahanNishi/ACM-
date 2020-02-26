
package javaapplication20;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int count=0;
        for (int i = 2; i <a; i++) {
            if(a%i==0){
                count++;
                break;
            }
            
        }
        if(count==0){
            System.out.println("Prime");}
        else{
            System.out.println("not prime");}
    }
    
}
