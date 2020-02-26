
package codeforce;

import java.util.Scanner;

public class Boy_or_Girl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String s=sc.next();
        int count=0;
        String temp="";
        
        for (int i = 0; i <s.length(); i++) {
            if(temp.indexOf(s.charAt(i)) == -1){
                temp = temp + s.charAt(i);
            }}
            if(temp.length()%2==0){
                System.out.println("CHAT WITH HER!");}
            else{
                System.out.println("IGNORE HIM!");}
        }
    }
    

