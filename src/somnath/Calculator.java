package somnath;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("enter two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(" sum  " + (a+b));
        System.out.println(" sub  " + (a-b));
        System.out.println(" mul  " + (a*b));
        System.out.println(" div  " + (a/b));


    }
}
