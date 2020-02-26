
package linkedlist;

import java.util.LinkedList;

public class Studentlistdemo {
    public static void main(String[] args) {
        LinkedList<Student> list=new LinkedList<Student>();
        
        Student s1=new Student("toshiba","Bsc",23,01);
        Student s2=new Student("Samira","Bsc",23,49);
        Student s3=new Student("Pritthi","Bsc",23,57);
        Student s4=new Student("Ratna","Bsc",23,50);
        Student s5=new Student("Fabby","Bsc",23,60);
        
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        
        for(Student s:list){
            System.out.println(s.rollno+" "+s.name+" "+s.age+" "+s.classname);}
    }
    
}
