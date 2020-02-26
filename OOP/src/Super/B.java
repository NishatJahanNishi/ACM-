
package Super;

public class B extends A {
    
    @Override
    void display(){
        super.display();
        System.out.println("Inside class B");
    }
    public static void main(String[] args) {
        B ob=new B();
        ob.display();
        
    }
}
