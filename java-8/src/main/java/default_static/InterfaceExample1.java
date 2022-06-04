package default_static;

@FunctionalInterface
public interface InterfaceExample1 {

    void method(String val);

    default void log(String val){
        System.out.println("Interface log::"+ val);
    }

    static void print(String val){
        System.out.println("Interface print::"+val);
    }
}
