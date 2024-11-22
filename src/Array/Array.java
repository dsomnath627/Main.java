package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // store 5 roll.no
        // array of primitives
//        int[] roll= new int[5];
//        for (int i = 0; i < roll.length; i++) {
//          roll[i]=in.nextInt();
//        }
//        System.out.println(Arrays.toString(roll));
//        for(int i : roll){
//            System.out.print(i + " ");
//        }
        // Array of Objects
        String[] str = new String[5];

        for (int i = 0; i < str.length; i++) {
            str[i]= in.next();
        }
        System.out.println(Arrays.toString(str));
        change(str);
        System.out.println(Arrays.toString(str));

        //modify
      //  str[2]="sonu"; //change original obj
//        System.out.println(Arrays.toString(str));
    }
    static void change(String[] change){
        change[0]="sonu";
    }
}
