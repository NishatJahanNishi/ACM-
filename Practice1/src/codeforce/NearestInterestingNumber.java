package codeforce;

import java.util.Scanner;

public class NearestInterestingNumber {
    
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
         int r,temp,sum=0;
        temp=a;
        while(temp!=0){
        r=temp%10;
        sum=sum+r;
        temp=temp/10;
       }
        
        
       if(sum%4==0){
           System.out.println(a);}
       else{
           for(;;a++){
        int n=a;
        int cnt=0;
        while(n>0){
            cnt+=n%10;
            n/=10;
        }
        if(cnt%4==0){
            System.out.println(a);
        break;}}
       }
           
            
        
    
}
}

    

