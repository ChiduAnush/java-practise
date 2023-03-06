import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("lets try conditional statements!");

        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();


        if(salary >2000 ){
            salary += 2000;
        }else{
            salary += 1000;
        }

        System.out.println(salary);




    }
}