
package oop;

public class Box {
    double width,height,depth;
    Box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
}
    void displayVol(){
    double vol=height*width*depth;
        System.out.println(vol);}
    
    
}
