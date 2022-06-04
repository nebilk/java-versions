package functional_interface;

@FunctionalInterface
public interface Addable {

    int add(int a, int b);

    default void def_method1(){
        System.out.println("Default method 1");
    }

    default void def_method2(){
        System.out.println("Default method 2");
    }

    static void static_method1(){
        System.out.println("Static method 1");
    }

    static void static_method2(){
        System.out.println("Static method 2");
    }
}