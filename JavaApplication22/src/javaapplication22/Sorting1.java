
package javaapplication22;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting1 {
    public static void main(String[] args) {
        
    
    System.out.println("Enter Array Size ?");
		Scanner input = new Scanner(System.in);
		int sz = input.nextInt();
		int arr[] = new int[sz];
		System.out.println("Enter " + sz + " numbers in unsorted order :");
		for (int i = 0; i < sz; ++i) {
			int val = input.nextInt();
			arr[i] = val;
		}
		Arrays.sort(arr);
		System.out.println("Resulting Sorted array :");
		for (int i = 0; i < sz; ++i) {
			System.out.print(arr[i] + " ");
		}
    
}
}
