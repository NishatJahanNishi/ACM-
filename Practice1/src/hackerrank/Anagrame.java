
package hackerrank;

import java.util.Arrays;
import java.util.Scanner;



public class Anagrame {
   static boolean isAnagram(String firstWord, String secondWord) {
     char[] word1 = firstWord.toLowerCase().toCharArray();
     char[] word2 = secondWord.toLowerCase().toCharArray();
     Arrays.sort(word1);
     Arrays.sort(word2);
     return Arrays.equals(word1, word2);
    }
    /* Driver program to test to print printDups*/
    public static void main(String args[]) 
    { 
       Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");

    } 
} 

    
    
    
    
   