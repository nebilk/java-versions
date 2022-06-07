package stream.group;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingDemo {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Ali",
                "Veli",
                "Ali",
                "Mehmet",
                "Ahmet",
                "Ahmet",
                "Ahmet",
                "Veli"
        );

        final Map<String, Long> counting = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(counting);

        counting.forEach((name, count) -> System.out.println(name + " > " + count));
    }
}
