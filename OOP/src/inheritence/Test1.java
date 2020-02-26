
package inheritence;

public class Test1 {
    public static void main(String[] args) {
        Animal a=new Animal();
        Person1 p=new Person1();
        Teacher t=new Teacher();
        
        System.out.println(a instanceof Person1);
        System.out.println(p instanceof Animal);
        System.out.println(t instanceof Person1);
        System.out.println(p instanceof Teacher);
        System.out.println(a instanceof Teacher);
        System.out.println(p instanceof Animal);
        System.out.println(t instanceof Animal);
    }
    
}
