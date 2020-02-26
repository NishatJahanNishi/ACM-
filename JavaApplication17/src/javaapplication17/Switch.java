
package javaapplication17;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int digit;
        System.out.println("Enter the number");
        digit=input.nextInt();
        switch(digit){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("out of range");
    }
    }
}
    

