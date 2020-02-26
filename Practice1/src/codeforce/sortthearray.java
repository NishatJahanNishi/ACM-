
package codeforce;

import java.util.Arrays;
import java.util.Scanner;

public class sortthearray {
    static boolean checkReverse(int arr[], int n) { 
        // Copying the array.  
        int temp[] = new int[n]; 
        for (int i = 0; i < n; i++) { 
            temp[i] = arr[i]; 
        } 
  
        // Sort the copied array.  
        Arrays.sort(temp); 
  
        // Finding the first mismatch.
        
        int front; 
        for (front = 0; front < n; front++) { 
            if (temp[front] != arr[front]) { 
                break; 
            } 
        } 
  
        // Finding the last mismatch. 
        
        int back; 
        for (back = n - 1; back >= 0; back--) { 
            if (temp[back] != arr[back]) { 
                break; 
            } 
        }
    
  
        // If whole array is sorted  
        if (front >= back) { 
            return true; 
        } 
  
        // Checking subarray is decreasing or not.  
        do { 
            front++; 
            if (arr[front - 1] < arr[front]) { 
                return false; 
            } 
        } while (front != back); 
  
        return true; 
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int num = sc.nextInt();

        int arr[] = new int[num];

        

        for (int i = 0 ; i < arr.length; i++ ) {
           arr[i] = sc.nextInt();
        }
        int n=arr.length;
if (checkReverse(arr, n)) { 
            System.out.print("Yes"); 
            
        } else { 
            System.out.print("No"); 
        } 
        
    }

   
}
    
    

