
package array;

public class Array2D {
    public static void main(String[] args) {
        int[][]num1=new int[2][3];
        num1[0][0]=10;
        num1[0][1]=20;
        num1[0][2]=30;
        num1[1][0]=40;
        num1[1][1]=50;
        num1[1][2]=60;
        
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col <3 ; col++) {
                System.out.print("  "+num1[row][col]);
                
            }
            System.out.println();
            
        }
        
    }
    
}
