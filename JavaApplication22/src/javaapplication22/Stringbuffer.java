
package javaapplication22;

public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("Nishi");
        System.out.println(s1);
        
        s1.append(" Haque ");
        System.out.println(s1);
        
        s1.append(25);
        System.out.println(s1);
        
        s1.reverse();
        System.out.println(s1);
    }
    
}
