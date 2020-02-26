
package codeforce;

import java.util.Scanner;

public class Young_Physicist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int sum=0;
                int sum1=0;
        int sum2=0;
int a,b,c;
        
        for (int i = 1; i <=n; i++) {
             a=sc.nextInt();
             b=sc.nextInt();
             c=sc.nextInt();
           
        sum=sum+a;
            sum1=sum1+b;
            sum2=sum2+c;
        }
            if(sum==0 && sum1==0 && sum2==0){
                System.out.println("YES");}
            else{
                System.out.println("NO");}
    }
}
