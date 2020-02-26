
package codeforce;


import java.util.Scanner;

public class Helpful_Maths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String s=sc.next();
        int count1=0;
                int count2=0;
        int count3=0;
        String ans="";
        
        for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1'){
        count1++;}
        else if(s.charAt(i)=='2'){
        count2++;}
        
        else if(s.charAt(i)=='3'){
        count3++;}}
        
        for(int i=0;i<count1;i++){
        ans=ans+"1+";}
         for(int i=0;i<count2;i++){
        ans=ans+"2+";}
          for(int i=0;i<count3;i++){
        ans=ans+"3+";}
          
          ans=ans.substring(0,s.length());
          System.out.println(ans);
        
        

    }
    
}
