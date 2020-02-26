
package Final_keyword;

public class University {
    final String NAME="RUET";
    final int fees;
    
    University(){
        fees=1000;
    }
    
    void display(){
        System.out.println(NAME);
        System.out.println(fees);}
    
    public static void main(String[] args) {
        
       University u1=new University();
       u1.display();
    }
    
}
