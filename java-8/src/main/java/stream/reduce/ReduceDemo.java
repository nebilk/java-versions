package stream.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class ReduceDemo {
    public static void main(String[] args) {
        final List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6);
        final Integer reduce = numberList.stream()
//                .reduce(0, (a, b) -> a + b); // SAME
                .reduce(0, Integer::sum);
        System.out.println(reduce);

        // SAME RESULT
        final int sum = numberList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        final OptionalDouble average = numberList.stream().mapToInt(Integer::intValue).average();
        System.out.println(average.isPresent() ? average.getAsDouble() : 0);

        final Optional<Integer> reduce1 = numberList.stream().reduce(Integer::sum);
        System.out.println(reduce1.get());

        final Integer multiply = numberList.stream().reduce(1, (a, b) -> a * b);
        System.out.println(multiply);

        final Integer maxReduce = numberList.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(maxReduce);

        // OR

        final Integer integer = numberList.stream().reduce(Integer::max).get();
        System.out.println(integer);

        final Integer reduce3 = numberList.stream().reduce((a, b) -> a + b).get();
        System.out.println(reduce3);

        final List<String> nameList = Arrays.asList("Veli", "Ahmet", "Ali");
        final Optional<String> reduce2 = nameList.stream().reduce(String::concat);
        System.out.println(reduce2.get());

        // get max length
        final String s = nameList.stream().reduce((val1, val2) -> val1.length() > val2.length() ? val1 : val2).get();
        System.out.println(s);

    }
}
