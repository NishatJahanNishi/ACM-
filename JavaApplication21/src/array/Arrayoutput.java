
package array;

public class Arrayoutput {
    public static void main(String[] args) {
        int[][]num1=new int[4][];
        int k=0;
        num1[0]=new int[1];
        num1[1]=new int[2];
        num1[2]=new int[3];
        num1[3]=new int[4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                num1[i][j]=k;
                k++;
                
            }
            
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <i+1; j++) {
                System.out.print(num1[i][j]+" ");
                
            }
            System.out.println();
            
        }
    }
}
    

