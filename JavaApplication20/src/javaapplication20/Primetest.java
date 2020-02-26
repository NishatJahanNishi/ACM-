
package javaapplication20;

import java.util.Scanner;

public class Primetest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,count=0;
        a=input.nextInt();
        b=input.nextInt();
        for (int i = a; i <=b; i++) {
            for (int j = 2; j <i-1; j++) {
                if(i%j==0){
                    count++;
                    break;
                }
                
            }
            if(count==0){
                System.out.println(i);}
            count=0;
            
            
        }
    }
    
}
