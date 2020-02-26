
package javaapplication19;

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        int n,m;
        m=input.nextInt();
        n=input.nextInt();
        for (int i = m; i <= n; i++) {
            if(i%2!=0){
            sum=sum+i;
            }
            
            
        }
        System.out.println(sum);
    }
    
}
