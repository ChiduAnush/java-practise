import java.util.Scanner;

public class UppercaseLowercase {
    public static void main(String[] args) {
        System.out.println("to check whether a char is uppercase or lower case.");
        Scanner input = new Scanner(System.in);

        char c = input.next().trim().charAt(0);

        if(c >= 'a' && c <= 'z'){
            System.out.println("its lower case");
        }
        if(c >= 'A' && c <= 'Z'){
            System.out.println("its upper case");
        }

    }
}
