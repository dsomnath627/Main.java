package somnath;

import java.sql.Statement;
import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
//       int ans = sum2();
//        System.out.println(ans);
//        sum();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number");
//        int ans = sum3(sc.nextInt(), sc.nextInt());
//        System.out.println(ans);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String person = abc(sc.next());
        System.out.println(person);
    }

    static String abc(String name) {
        String mes = " Hii " + name;
        return mes;
    }

    static  int sum3(int a,int b){
        int sum = a+b;
        return sum;
    }
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("your input is " + a + " and " + b);
        int sum = a+b;
        return sum;
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("your input is " + a + " and " + b);
        System.out.println("sum is " + (a+b));

    }
}
