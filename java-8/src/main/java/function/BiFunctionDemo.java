package function;

import java.util.function.BiFunction;

public class BiFunctionDemo {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> biFunction1 = Integer::sum;

        final Integer apply = biFunction1.apply(1, 3);
        if (apply == 3){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        BiFunction<Integer, Integer, String> biFunction2 = (a,b) -> "The multiplier of " + a + " * " + b + " is : " + (a*b);
        System.out.println(biFunction2.apply(10, 30));

    }
}
