
package Staticdemo;

public class Staticblock1 {
    static String n;
    static int a;
    
    static{
    n="nishi";
    a=22;}
    static void display(){
        System.out.println(n);
        System.out.println(a);
    }
    public static void main(String[] args) {
        Staticblock1.display();
    }
   
    
}
