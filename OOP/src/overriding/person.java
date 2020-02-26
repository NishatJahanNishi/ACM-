
package overriding;

public class person extends Teacher {
    String qualification;
    int mobilenumber;
    
    @Override
    void displayinfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(qualification);
        System.out.println(mobilenumber);
    
    }
    public static void main(String[] args) {
        person p1=new person();
        p1.name="nishi";
        p1.age=22;
        p1.qualification="BSC in ECE";
        p1.mobilenumber=345;
        p1.displayinfo();
        
        Teacher t1=new Teacher();
        t1.name="tusher";
        t1.age=23;
        //t1.qualification="BSC in CSE";
        t1.displayinfo();
    }
    
    
}
