
package codeforce;


import java.util.Scanner;

public class Choosing_Laptop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int[]arr=new int[n];
       
        for (int i = 0; i < n; i++) {
            int processor_speed=sc.nextInt();
            int ram=sc.nextInt();
            int hdd=sc.nextInt();
            int cost=sc.nextInt();
            
            if(processor_speed>=1000 && processor_speed<=4200 && ram>=256 &&ram<=4096 && hdd>=1 && hdd<=500 && cost>=100 &&cost<=1000){
                }
            
            
        }
        

        
    }
    
}
