package somnath;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//    fun(2,3,4,5,6,7,8,9,8); // var length argument
//    muttiple(2,3,"rahul","sonu");
    demo(6778);
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void muttiple(int a,int b,String ...v){


    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
