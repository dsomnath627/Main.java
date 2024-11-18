package somnath;

public class FunctionOverloading{
    public static void main(String[] args) {
fun(67);
fun("sonu");
    }
    static void fun(int a){
        System.out.println(a);

    }
    static void fun(String name){
        System.out.println(name);
    }
}
