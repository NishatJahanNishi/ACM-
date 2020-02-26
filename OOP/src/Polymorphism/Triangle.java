
package Polymorphism;

public class Triangle extends Shape {
    double base,height;
    
    Triangle(double base,double height){
        this.base=base;
        this.height=height;
        
    }
    @Override
    double area(){
    return 0.5*base*height;}
    
    public static void main(String[] args) {
        Shape [] s=new Shape[10];
         s[0]=new Shape();
        
        s[1]=new Rectangle(12.65,3.56);
       
        s[2]=new Triangle(22.38,1.45);
        
        for (int i = 0; i < 10; i++) {
            System.out.println(s[i].area());
        }
        
        
    }
}
