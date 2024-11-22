package Array;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        int y = sc.nextInt();
        if (y % 400 == 0 || y % 4 == 0 && y % 100 != 0 ) {
            System.out.print(y + " leap year");
        }else {
            System.out.print(y + " is not  leap year");
        }
    }
}
