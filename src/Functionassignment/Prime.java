//Q7 Define a method to find out if a number is prime or not.
package Functionassignment;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range");
        int range = sc.nextInt();

        for (int i = 2; i <= range; i++) {
            if(isPrime(i)){
                System.out.println(i + " is prime");
            }else {
                System.out.println(i + " is ODD");
            }
        }

    }

     static boolean isPrime(int j) {
        if (j <= 1){
            return  false;
        }
         for (int i = 2; i <= Math.sqrt(j); i++) {
             if (j % i == 0) {
                 return false;
             }
         }
         return true;
     }
}
