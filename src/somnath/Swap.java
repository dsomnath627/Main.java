package somnath;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* System.out.print("Enter A Input : ");
        int a = sc.nextInt();
        System.out.print("Enter B Input : ");
        int b = sc.nextInt();
        s(a,b);

        // change name
        System.out.print("enter the name: ");
        String name = sc.next();
        changename(name); */
        // change array
        int[] arr = {1,3,2,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void change(int[] nums) {
        nums[0]=99;

    }

     /* static void changename(String name) {
        name = "somnath";
         System.out.println(name);
    }

    static void s(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("A :" + a + "\n"+ "B :" + b);
    } */

}
