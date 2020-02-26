
package javaapplication23;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Currenttime {
    public static void main(String[] args) {
        LocalTime t=LocalTime.now();
        DateTimeFormatter f=DateTimeFormatter.ofPattern("hh:mm:ss");
        String ct=t.format(f);
        System.out.println(ct);
    }
    
}
