
package codeforce;

import java.util.Scanner;


public class codeforce1204A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String binary=sc.next();
        
        int n = binary.length();
		if (n % 2 == 0) {
			System.out.println(n / 2);
			return;
		}
		int ans = n / 2 ;
		for (int i = 1; i < n; i++)
			if (binary.charAt(i) == '1') {
				ans++;
				break;
			}
		System.out.println(ans);
	}
            
        }
    
    

