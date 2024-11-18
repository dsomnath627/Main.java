package somnath;

public class Shadowing{
    static int A=90;
    public static void main(String[] args) {
        System.out.println(A);
        int A;
        A =40 ;
        System.out.println(A);
        fun();
    }
    static void fun(){
        System.out.println(A);
    }
}
