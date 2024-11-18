//@.5 Define a method that returns the product of two numbers entered by user.
package Functionassignment;

import java.util.Scanner;

public class ProductCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter A input :");
        int a = sc.nextInt();
        System.out.print("enter B input :");
        int b = sc.nextInt();
      int mul =  product(a,b);
        System.out.println("the product of two numbers : "+ mul);

}

    static int product(int a, int b) {
        int mul = a * b;
        return  mul;
    }
    }
