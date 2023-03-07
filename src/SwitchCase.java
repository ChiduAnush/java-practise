import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("switch statements");

        Scanner input = new Scanner(System.in);

        String fruit = input.next();

//        switch (fruit) {
//            case "apple":
//                System.out.println("a sweet red fruit");
//                break;
//            case "orange":
//                System.out.println(" an orange citrus fruit");
//                break;
//            case "banana":
//                System.out.println("a long shaped fruit, sweet");
//                break;
//            case "grapes":
//                System.out.println("small green sphere shaped fruits");
//                break;
//        }


        //a better way to do it, enhanced switch statement:
        switch (fruit) {
            case "apple" -> System.out.println("a sweet red fruit");
            case "orange" -> System.out.println(" an orange citrus fruit");
            case "banana" -> System.out.println("a long shaped fruit, sweet");
            case "grapes" -> System.out.println("small green sphere shaped fruits");
        }






    }
}
