//Q.2 Define a program to find out whether a given number is even or odd.
package Functionassignment;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number :");
        int num = sc.nextInt();
        prime(num);
    }

    static void prime(int num) {
        if(num % 2 == 0){
            System.out.println(num + " is a even number");
        }else {
            System.out.println( num +" is a odd number");
        }
    }
}
