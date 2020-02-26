
package filedemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class File1 {
    public static void main(String[] args) {
        
        File dir=new File("C:/Users/User/Desktop/Nishi");
        dir.mkdir();
        
        File file1=new File("C:/Users/User/Desktop/Nishi/Tusher.docs");
        File file2=new File("C:/Users/User/Desktop/Nishi/Samira.txt");
        File file3=new File("C:/Users/User/Desktop/Nishi/Shohan.jpg");
        
        try{
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
            System.out.println("File has been created.");
        }catch(Exception e){
            System.out.println(e);}
        
        int id;
        String name;
        try{
        Formatter formatter=new Formatter("C:/Users/User/Desktop/Nishi/Tusher.docs");
        Scanner input=new Scanner(System.in);
            System.out.println("How many students:");
            int n=input.nextInt();
            
            for(int i=1;i<=n;i++){
                System.out.print("Enter id and name: ");
            id=input.nextInt();
            name=input.next();
            formatter.format("%d %s\r\n",id,name);
            }
        formatter.close();
        
        }catch(FileNotFoundException e){
            System.out.println(e);}
        
        try{
        File file=new File("C:/Users/User/Desktop/Nishi/Tusher.docs");
        Scanner input=new Scanner(file);
        
        while(input.hasNext()){
        id=input.nextInt();
        name=input.next();
            System.out.println("id: "+id+"  name: "+name);}
        input.close();}
        catch(Exception e){System.out.println(e);}
    }
    
}
