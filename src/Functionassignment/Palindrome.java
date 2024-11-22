//Q.10 Write a function to find if a number is a palindrome or not. Take number as parameter.
package Functionassignment;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num : ");
        int num = sc.nextInt();
      if ( checkPalindrome(num)){
          System.out.println("Palindrome");
      }else{
          System.out.println("not palindrome");
      }
    }
    static boolean checkPalindrome(int n){
        int r =0;
        int temp =n;
        while(temp != 0){
            r = (r*10)+(temp%10);
            temp =temp /10;
        }
        return r==n;
    }
}
