package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class MyConsumer implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println("Print : " + integer);
    }
}

public class ConsumerDemo {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);


        Consumer<Integer> consumer = val -> System.out.println("print : " + val);
        consumer.accept(20);
    }
}
