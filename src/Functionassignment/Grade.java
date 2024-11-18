//Q.8 Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

package Functionassignment;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the marks : ");
        int marks = sc.nextInt();
        String grade =grade(marks);
        System.out.print("Your Grade is : " + grade);
}

    static String grade(int a) {
        if(a>=91 && a<=100){
            return "AA";
        } else if (a>=81 && a<=90) {
            return  "AB";
        } else if (a>=71 && a<=80) {
            return  "BB";
        } else if (a>=61 && a<=70) {
            return "BC";
        } else if (a>=51 && a<=60) {
            return  "CC";
        } else if (a>=40 && a<=50) {
            return  "DD";
        } else {
            return "Fail";
        }
    }
    }
