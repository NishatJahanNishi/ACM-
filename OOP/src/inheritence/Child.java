
package inheritence;

import java.util.Scanner;

public class Child extends Person {
    String fathername;
    String mothername;
    
   void displayinfo2(){
   displayinfo1();
        System.out.println(fathername);
        System.out.println(mothername);
   }

    public static void main(String[] args) {
        Child c1=new Child();
        c1.name="nishi";
        c1.age=22;
        c1.fathername="Israil ahsan";
        c1.mothername="Maksuda ahsan";
        c1.displayinfo2();
        
        
    }
}
    

