
package codeforce;

import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
       int a=3;
       int b=3;
       
       int row=0;
       int col=0;
       
        for (int i = 1; i <= 5; i++) {
            String s=sc.nextLine().replace(" ", "");
            if(s.contains("1")){
            row=i;
            col=s.indexOf("1")+1;
            break;}
            
        }
        System.out.println(Math.abs(b-row)+Math.abs(a-col));
        
    }
    
}
