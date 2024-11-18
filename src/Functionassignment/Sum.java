//Q.4 Write a program to print the sum of two numbers entered by user by defining your own method.

package Functionassignment;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
       int add = sum(a,b);
        System.out.println("The result is :" + add);
    }

     static int sum(int a,int b) {
        int sum = a+b;
        return sum;
    }
}
