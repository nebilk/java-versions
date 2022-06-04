package functional_interface;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 10 * 4;
        System.out.println(supplier.get());

        Supplier<String> supplierString = () -> "Test";
        System.out.println(supplierString.get());

    }
}
