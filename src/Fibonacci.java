import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("print nth term of the fibonacci series");

        System.out.println("input n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;

        //System.out.println(a);    to print first term.
        //System.out.println(b);    to print second term.


        for(int i = 0; i < n-1; i++) {

            c = a + b;


            a = b;
            b = c;

            //System.out.println(c);  this is to print the whole series.
        }

        System.out.println(c);






    }
}
