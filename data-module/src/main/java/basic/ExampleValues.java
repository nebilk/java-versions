package basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ExampleValues {
    public static List<String> getNameList(){
        return Arrays.asList("Murat", "Ahmet", "Ali");
    }

    public static Map<Integer, String> getMap(){
        Map<Integer, String> mapValues = new HashMap<>();
        mapValues.put(1, "a");
        mapValues.put(2, "b");
        mapValues.put(3, "c");
        mapValues.put(4, "d");
        return mapValues;
    }

    public static List<Integer> getNumberList(){
        return Arrays.asList(1, 2, 3, 4, 5, 6);
    }

    public static Stream<String> getBasicStream(){
        return Stream.of("a", "b", "c", "d");
    }
}
