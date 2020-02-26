
package Abstraction;

public class Rectangle extends Shape {
    
    Rectangle(double a,double b){
    super(a,b);
    }
    @Override
    void area(){
        double result=a*b;
        System.out.println(result);
    }
    
    
}
