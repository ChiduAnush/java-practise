public class Overloading {
    public static void main(String[] args) {
        fun(45);
        fun("anush");

    }

    static void fun(int n){
        System.out.println(n);
    }

    static void fun(String n){
        System.out.println(n);
    }



}
