
package javaapplication20;

import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,sum=0,temp,r;
        num=input.nextInt();
        temp=num;
        
       while(temp!=0){ 
           r=temp%10;
           sum=sum+r;
           temp=temp/10;}
        System.out.println(sum);
        
    }
    
}
