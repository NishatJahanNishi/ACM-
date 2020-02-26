
package array;

import java.util.Scanner;

public class Maxmin {
    public static void main(String[] args) {
       
        Scanner input =new Scanner(System.in);
        double[]num1=new double[5];
        double sum=0;
        for (int i = 0; i < 5; i++) {
            num1[i]=input.nextDouble();
           }
        System.out.println(num1[0]);
        double max;
        max=num1[0];
        for (int i = 1; i <5; i++) {
            if(max<num1[i]){
            max=num1[i];}
            
        }
        System.out.println(max);
        
        
            
        }
        
        
    
}
    

