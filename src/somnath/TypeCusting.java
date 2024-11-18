package somnath;

import java.util.Scanner;

public class TypeCusting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("int");
        int i = sc.nextInt();
        System.out.println("byte");
        byte b = sc.nextByte();
        char c = 'a';
        System.out.println("short");
        short s = sc.nextShort();
        System.out.println("float");
        float f = sc.nextFloat();
        System.out.println("double");
        double d = sc.nextDouble();
        double result = (f*b) + (i/c) - (d-s);
        System.out.println((f*b) + " " + (i/c) + " " + (d-s));
        System.out.println(result);


    }
}
