
package codeforce;

import java.util.Scanner;

public class Chat_room {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String s=sc.next();
        char []c="hello".toCharArray();
        int count=0;
       
        
        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)==c[count]){
            count++;
            if(count==5){
            break;}
            }}
            
            if(count==5){
                System.out.println("YES");
                
            }
            else{
                System.out.println("NO");}
            
        }
    }
 

