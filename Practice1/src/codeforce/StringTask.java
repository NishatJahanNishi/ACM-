
package codeforce;

import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String s= sc.nextLine();
        
         s=s.toLowerCase();
         
         
         for(int i = 0; i < s.length(); ++i)
        {
            char ch = s.charAt(i);
            
             if(ch == 'b' || ch == 'c' || ch == 'd' || ch == 'f' || ch == 'g' || 
                     ch=='h'|| ch=='j'|| ch=='k'|| ch=='l'|| ch=='m'|| ch=='n'|| 
                     ch=='p'|| ch=='q'|| ch=='r'|| ch=='s'|| ch=='t'|| ch=='v'|| 
                     ch=='w'|| ch=='x'|| ch=='y'|| ch=='z') {
                  String s1=String.valueOf(ch);
                  System.out.print("." +s1);
            }
             
        
        
    }  
    
}
}
