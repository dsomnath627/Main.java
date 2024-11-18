// Q.1 Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
package Functionassignment;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter A input :");
        int a = sc.nextInt();
        System.out.print("enter B input :");
        int b = sc.nextInt();
        System.out.print("enter C input :");
        int c = sc.nextInt();

        int maxi = max(a,b,c);
        System.out.println(" the Max number is :"+maxi);
        int mini = min(a,b,c);
        System.out.println("the mini number is :"+ mini);
    }

     static int min(int a, int b, int c) {
        int mini = a;
        if (mini > b){
            mini = b;
        }if(mini > c){
            mini = c;
         }
        return  mini;
    }

    static int max(int a, int b,int c) {
        int max = a;
        if (max < b){
            max = b;
        }if (max< c){
            max = c;
        }
        return max;
    }

}
