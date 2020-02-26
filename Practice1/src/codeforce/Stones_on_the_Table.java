
package codeforce;

import java.util.Scanner;

public class Stones_on_the_Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        String s=sc.next();
        
        int count=0;
        char a=s.charAt(0);
        
        for (int i = 1; i < s.length(); i++) {
            if(a==s.charAt(i)){
            count++;}
            a=s.charAt(i);
            
        }System.out.println(count);
    }
    
}
