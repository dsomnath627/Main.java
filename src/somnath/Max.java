package somnath;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        System.out.println("enter three number");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
//        int max = a;
//        if(max<b) {
//            max = b;
//            if (max<c){
//                max = c;
//            }
//        } else {
//            if (max<c){
//                max = c;
//            }
//        }
//        System.out.println("max " + max);
        int max = Math.max(c, Math.max(a,b));
        System.out.println("max" + max);
    }
}
