package functional_interface;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<Integer> predicate = v -> v > 10;
        System.out.println(predicate.test(50));

        Predicate<Integer> predicate2 = val -> {
            if (val % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };
        predicate2.test(8);

    }
}
