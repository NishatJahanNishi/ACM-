
package Staticdemo;

public class Static1 {
    String name;
    int idno;
    static String uni="RUET";
    

Static1(String n,int i){
    name=n;
    idno=i;

}
void display(){
    System.out.println(name);
    System.out.println(idno);
    System.out.println(uni);}
}
