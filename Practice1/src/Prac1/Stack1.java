
package Prac1;
import java.util.Stack;
public class Stack1 {
    public static void main(String args[]) {

      // creating stack
      Stack st = new Stack();

      // populating stack
      st.push(10);
      st.push(20);
      st.push(30);

      // checking the top object
      System.out.println("Top object is: "+st.peek());
    }
    
}
