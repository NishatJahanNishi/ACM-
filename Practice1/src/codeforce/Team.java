
package codeforce;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int count=0;
        
        for(int i=0;i<n;i++){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        if(a==1 && b==1 && c==1){
            count++;
        }
        else if(a==1 && b==1 && c==0){
        count++;}
        else if(a==0 && b==1 && c==1){
        count++;}
        else if(a==1 && b==0 && c==1){
        count++;}
    }
        System.out.println(count);}
}
