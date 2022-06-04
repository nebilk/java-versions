package function;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<Integer, String> function = a -> "Value is : " + a;
        System.out.println(function.apply(10));
    }
}
