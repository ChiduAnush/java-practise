import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        System.out.println("to find the largest of the 3 numbers");
        Scanner input = new Scanner(System.in);

        System.out.println("input 3 numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

//        if (a > b && a > c){
//            System.out.println("largest number is: " + a);
//        }else{
//            if(b > c){
//                System.out.println("largest is " + b);
//            }else{
//                System.out.println("largest is  " + c);
//            }
//        }

//        int max = a;
//        if(b > max){
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }

        int max = Math.max(Math.max(a, b), c);

        System.out.println(max);
    }
}
