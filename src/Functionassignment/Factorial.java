//Q9 Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n

package Functionassignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num : ");
        int num = sc.nextInt();

       int fact = fact(num);{
            System.out.println("the factorial of a number : " + fact);
        }
}

     static int fact(int n) {
        int fac =1;
         for (int i = 1; i <=n; i++) {
             fac = fac*i;
         }
         return fac;
     }

    }
