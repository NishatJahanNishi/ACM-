
package thesis;

import java.util.Scanner;

public class Thesis {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
       String no="N";
       int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
           double trans_amt_per_day=sc.nextDouble();
           double trans_amt=sc.nextDouble();
           int num_of_declined=sc.nextInt();
           String IsHighRiskCountry=sc.next();
           String IsForeignTrans=sc.next();
           int six_month_chbk_freq=sc.nextInt();
           
           
           double diff=trans_amt-(trans_amt_per_day*30);
           
           if(diff>=1000){
               System.out.println("Fraud");}
           else if(num_of_declined>0){
               System.out.println("Fraud");}
           else if(six_month_chbk_freq>0){
               System.out.println("Fraud");}
           else if(IsHighRiskCountry.equals(no) && IsForeignTrans.equals(no)){
               System.out.println("Fraud");}
           else{
               System.out.println("Not Fraud");}
        }
    }
    
}
