// Q.3 A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
package Functionassignment;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        eligible(age);
    }

     static void eligible(int age) {
        if(age>=18){
            System.out.println("you are  eligible for vote");
        }else {
            System.out.println("you are not  eligible for vote");
        }
    }
}
