
package codeforce;

import java.util.Scanner;

public class Lucky_Division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
       if(checknumber(n)){
           System.out.println("YES");}
       else{
           System.out.println("NO");}
        
    }
        public static boolean checknumber(int a){
            
        if(a%4==0 ||a%7==0){
        return true;}
        String s1=Integer.toString(a);
        s1=s1.replace("4", "");
        s1=s1.replace("7", "");
        if(s1.length()==0){
            return true;}
        return false;
    }
    
}

