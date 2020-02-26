
package javaapplication23;

public class Wrapperclass {
    public static void main(String[] args) {
        int x=20;
        System.out.println(x);
        
        Integer y=Integer.valueOf(x);
        System.out.println("y= "+y);
        
        int e=y.intValue();
        System.out.println("e = "+e);
    }
    
}
