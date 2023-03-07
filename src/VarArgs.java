import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        multiple(15, 20, "chidu", "mom", "dad", "shalu");

    }



    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }

    static void multiple(int a, int b, String ...v){

    }


}
