
package javaapplication22;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        String firstname=input.nextLine();
        String lastname=input.nextLine();
        String fullname=firstname.concat(lastname);
        System.out.println(fullname);
        String uppername=fullname.toUpperCase();
        System.out.println(uppername);
    }
    
}
