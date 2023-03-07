public class Shadowing {


    static int x = 90; //this will be shadowed at line 11;
    public static void main(String[] args) {
        System.out.println(x); //prints 90
        int x;
//        System.out.println(x);  //gives error cause, scope will begin only after value is initialsed.
        x = 40;
        System.out.println(x);  //prints 40
        fun(); // this will still print 90 only.
    }

    static void fun(){
        System.out.println(x);
    }
}
