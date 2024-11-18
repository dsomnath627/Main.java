package somnath;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // int n=in.nextInt();
        for (int i= 100;i<1000;i++){
            if (armstrong(i)){
                System.out.println(i);
            }

        }
        //System.out.println(armstrong(n));
    }
    static boolean armstrong(int n) {
        int num = n;
        int result = 0;
        int r;
        while(num !=0){
           r = num % 10;
           result +=Math.pow(r,3);
           num /= 10;
        }
        return result == n;
    }

}
