
package Polymorphism;

public class Student extends Person {
    @Override
    void display(){
        System.out.println("I am a student");}
    public static void main(String[] args) {
        Person p=new Person();
        p.display();
        p=new Teacher();
        p.display();
        p=new Student();
        p.display();
    }
    
}
