package somnath;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("your input is " + a + " and " + b);
        System.out.println("sum is " + (a+b));
    }
}
