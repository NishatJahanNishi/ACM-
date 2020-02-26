
package oop;

public class Callbyref1 {
    public static void main(String[] args) {
        
    
    Callbyref x=new Callbyref();
    x.name="tusher";
        System.out.println(x.name);
        
        x.change(x);
        System.out.println(x.name);
    
    
}
}
