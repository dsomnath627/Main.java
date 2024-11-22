package somnath;

public class StringExample {
    public static void main(String[] args) {
        String m = s();
       // System.out.println(m.toLowerCase()); //Q1
     //   System.out.println(m.toUpperCase()); // Q1
       // System.out.println(m.replace(" ","_")); // Q2
        System.out.println(m.replace("<|name|>","sonu"));
    }
    static String s(){
        //String s1 = "How Are you";
        String s2 = "Hey <|name|>,how are you";
        return s2;
    }
}
