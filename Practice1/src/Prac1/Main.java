
package Prac1;


import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        double t;
        int a,b,c,d;
        
        
        while(sc.hasNext()){
        t=sc.nextDouble();
        int y = (int) t;
        a=y/100;
            System.out.println("NOTAS:");
            System.out.println(a+ " nota(s) de R$ 100.00");
            b=y%100;
            a=b/50;
            System.out.println(a+ " nota(s) de R$ 50.00");
            b=b%50;
            a=b/20;
            System.out.println(a+" nota(s) de R$ 20.00");
            b=b%20;
            a=b/10;
            System.out.println(a+" nota(s) de R$ 10.00");
            b=b%10;
            a=b/5;
            System.out.println(a+" nota(s) de R$ 5.00");
            b=b%5;
            a=b/2;
            System.out.println(a+" nota(s) de R$ 2.00");
            
            
            System.out.println("MOEDAS:");
            
            b=b%2;
            a=b/1;
            System.out.println(a+" moeda(s) de R$ 1.00");
            double z=t-y;
            c=z/0.50;
            int x=(int)c;
            System.out.println(x+" moeda(s) de R$ 0.50");
            d=z%0.50;
            c=d/0.25;
             x=(int)c;
            System.out.println(x+" moeda(s) de R$ 0.25");
             d=d%0.25;
            c=d/0.10;
             x=(int)c;
            System.out.println(x+" moeda(s) de R$ 0.10");
             d=d%0.10;
            c=d/0.05;
             x=(int)c;
            System.out.println(x+" moeda(s) de R$ 0.05");
             d=d%0.05;
            c=d/0.01;
             x=(int)c;
            System.out.println(x+" moeda(s) de R$ 0.01");
            System.out.println();
        }
        
        
        
    }
}