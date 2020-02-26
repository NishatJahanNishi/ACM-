
package codeforce;

import java.util.Scanner;

public class BitA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int y=0;
        
        for(int i=0;i<n;i++){
        String a = sc.next();
       if(a.charAt(0)=='X'){
           if(a.charAt(1)=='+'){
         y++;}
       if(a.charAt(1)=='-'){
       y--;}}
       else if(a.charAt(0)=='+'){
       ++y;}
       else{
           --y;}
            
        }
        System.out.println(y);
        
    }
    
}
