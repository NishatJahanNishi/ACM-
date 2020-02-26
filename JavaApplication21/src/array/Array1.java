
package array;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double[]num1=new double[5];
        double sum=0;
        for (int i = 0; i < 5; i++) {
            num1[i]=input.nextDouble();
            
        }
        for (int i = 0; i < 5; i++) {
            sum=sum+num1[i];
            
        }
        System.out.println(sum);
    
        
    }
    
}
