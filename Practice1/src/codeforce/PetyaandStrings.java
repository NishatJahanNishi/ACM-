
package codeforce;

import java.util.Scanner;

public class PetyaandStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String s1=sc.nextLine();
        s1=s1.toLowerCase();
        String s2=sc.nextLine();
        s2=s2.toLowerCase();
       int result=s1.compareTo(s2);
        
        if(result<0){
            System.out.println("-1");}
        else if(result>0){
                System.out.println("1");}
        else{
                System.out.println("0");
            }
    }
    
}

