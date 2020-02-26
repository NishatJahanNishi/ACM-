
package Prac1;

public class Stack2 {
    int max=10;
     int top;
    int a[]=new int[max];
    int size = a.length;
    
    boolean isempty(){
        return (top<0);
    }
    Stack2() {
        top=-1;}
 
    boolean push(int x) 
    { 
        if (top >= (max-1)) 
        { 
            System.out.println("stack 0verflow"); 
            return false; 
        } 
        else
        { 
            a[++top] = x; 
            System.out.println(x + " pushed into stack"); 
            return true; 
        } 
    } 
  
    int pop() 
    { 
        if (top < 0) 
        { 
            System.out.println("stack underflow"); 
            return 0; 
        } 
        else
        { 
             int x = a[top--]; 
            return x; 
        } 
    }
    int peek(){
   int y=a[top++];
    return y;}
    
    public static void main(String args[]) 
    { 
        Stack2 s = new Stack2(); 
        s.push(10); 
        s.push(20); 
        s.push(30);
        s.push(40);
        System.out.println(s.pop() + " popped");
        System.out.println("top value: "+ s.peek());
        } 
    
}
