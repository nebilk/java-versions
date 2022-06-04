package stream.foreach;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForeachDemo {

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Ali", "Veli", "Ahmet", "Mehmet");
        nameList.stream()
                .forEach(System.out::println);

        Map<Integer, String> mapValues = new HashMap<>();
        mapValues.put(1, "Ali");
        mapValues.put(2, "Veli");
        mapValues.put(3, "Ahmet");
        mapValues.put(4, "Mehmet");

        mapValues.keySet().stream()
                .forEach(System.out::println);

        mapValues.entrySet().stream()
                .forEach(System.out::println);

    }
}
