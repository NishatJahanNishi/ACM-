
package array;

import java.util.Scanner;

public class Array2Dsum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][]a=new int[2][3];
        int[][]b=new int[2][3];
        System.out.println("elements of a:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col <3; col++) {
                System.out.printf("a[%d][%d]=",row,col);
                a[row][col]=input.nextInt();
               }
            
        }
        System.out.println("elements of b:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col <3; col++) {
                System.out.printf("b[%d][%d]=",row,col);
                b[row][col]=input.nextInt();
               }
            
        }
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+a[row][col]);
                
            }
            System.out.println();
            
        }
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+b[row][col]);
                
            }
            System.out.println();
            
        }
        System.out.println("a+b= ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+(a[row][col]+b[row][col]));
                
            }
            System.out.println();
            
        }
    }
    
}
