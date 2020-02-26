
package javaapplication19;

import java.util.Scanner;


public class Namta {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m,n;
        m=input.nextInt();
        n=input.nextInt();
        for (int i = m; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i+"x"+j+"="+i*j);
                
            }
            System.out.println();
            
        }
    }
    
}
