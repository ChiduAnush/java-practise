import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        swap(a, b);


    }

    static int sum(){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        return a+b;
    }


    static void greet(String name){
        System.out.println("hello " + name + "!");
        System.out.println("nice to meet you");
    }

    static void swap(int num1, int num2){
        System.out.println("before swapping: num1 = " + num1 + ",num2 =" + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping: num1 = " + num1 + ",num2 =" + num2);
    }






}
