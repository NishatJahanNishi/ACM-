
package javaapplication22;

public class String2 {
    public static void main(String[] args) {
        String s1=" Bangladesh is my country";
        System.out.println(s1);
        
        char ch= s1.charAt(3);
        System.out.println(ch);
        
        int value=s1.codePointAt(1);
        System.out.println(value);
        
        int value1=s1.codePointBefore(1);
        System.out.println(value1);
        
        int pos=s1.indexOf('a');
        System.out.println(pos);
        
        pos=s1.lastIndexOf('a');
        System.out.println(pos);
        
        String s2=s1.replace('a', 'i');
        System.out.println(s2);
        
        String[] s3=s1.split(" ");
        for(String x : s3){
            System.out.println(x);}
        
    }
    
}
