package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [][] arr = {
                {1,2,3,4,5,6},
                {7,8,9},
                {10,11,12,34}
        };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }



//        int [][] arr = new int[3][3];
//       //input
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = in.nextInt();
//            }
//        }
//        //output
//
//        for(int[] a :arr){
//            System.out.println(Arrays.toString(a));
//        }

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//
//        }



    }

}
