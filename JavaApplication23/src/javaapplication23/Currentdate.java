
package javaapplication23;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;

public class Currentdate {
    public static void main(String[] args) {
        Date date=new Date();
        
        DateFormat df=new SimpleDateFormat("dd.MM.YYYY");
        String cd=df.format(date);
        System.out.println(cd);
    }
    
}
