import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//
//        int[] arr = new int[5];  //declaring array
//        ArrayList<Integer> list = new ArrayList<>();   //declaring a Arraylist
//
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//
//        System.out.println(list.contains(25));
//
//        System.out.println(list);
//
//        list.set(0,118);
//        System.out.println(list);
//
////        list.remove(2);
////        System.out.println(list);
//
//        System.out.println(list.get(3));


        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();  //declaring a multidimensional ArrayList
        // list1.add(new ArrayList<>());   //to initialise it.
        //lets initialise in a for loop;
        for(int i = 0; i < 3; i++) {
            list1.add(new ArrayList<>());
        }
        
        //adding elements:
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++){
                list1.get(i).add(input.nextInt());
            }
        }

        System.out.println(list1);


    }
}
