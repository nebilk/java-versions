package stream.filter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterDemo {

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Ali", "Veli", "Ahmet", "Mehmet");
        nameList.stream()
                .filter(name -> name.contains("et"))
                .forEach(System.out::println);

        System.out.println();

        nameList.stream()
                .filter(name -> name.length() > 3)
                .forEach(System.out::println);

        System.out.println();
        Map<Integer, String> mapValues = new HashMap<>();
        mapValues.put(1, "Ali");
        mapValues.put(2, "Veli");
        mapValues.put(3, "Ahmet");
        mapValues.put(4, "Mehmet");

        mapValues.keySet().stream()
                .filter(val -> val * 2 == 4)
                .forEach(System.out::println);

        mapValues.entrySet().stream()
                .filter(val -> val.getValue().contains("et"))
                .forEach(System.out::println);

    }

}
