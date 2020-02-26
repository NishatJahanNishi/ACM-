
package codeforce;

import java.util.Scanner;

public class Theatre_square {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     long x,y;
 long n=sc.nextLong();
    long m=sc.nextLong();
    long a=sc.nextLong();
    
    x=n/a;
    y=m/a;
    
    if(n%a!=0)
      ++x;
    
     if(m%a!=0)
        ++y;
    
        System.out.println(x*y);
    
    
    
     
    

    
}
}

