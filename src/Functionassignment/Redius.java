//Q6 Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
package Functionassignment;

import java.util.Scanner;

public class Redius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius : ");
        int r = sc.nextInt();
        double area=area(r);
        System.out.println("area of a circle : " + area);
       double circumference = circumference(r);
        System.out.println("circumference of a circle : " + circumference);

    }

     static double area(int r) {
        double area = Math.PI *(r*r);
        return  area;
    }
    static double circumference (int r) {
        double circumference = Math.PI * 2 * r;
        return circumference;
    }

}
