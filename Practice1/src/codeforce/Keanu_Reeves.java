
package codeforce;

 

import java.util.Scanner;

public class Keanu_Reeves {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int len1=sc.nextInt();
        String str1=sc.next();
        int num0=0;
        int num1=0;
        for(int i=0;i<len1;i++)
        {
            char chr1=str1.charAt(i);
            if(chr1=='0')
            {
                num0++;
            }
            else
            {
                num1++;
            }
        }
        if(num0==num1)
        {
            System.out.print(2+"\n");
            System.out.print(str1.substring(0,len1-1)+" "+str1.substring(len1-1)+"");
        }
        else
        {
            System.out.print(1+"\n");
            System.out.println(str1+"");
        }
 
        
    }
}
 