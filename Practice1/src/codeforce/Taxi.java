
package codeforce;

import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        
        for (int i = 1; i <= n; i++) {
            int a=sc.nextInt();
            sum=sum+a;
        }
       if(sum%4==0){
           System.out.println(sum/4);}
       else{
           System.out.println((sum/4)+1);}
    }
    
}
