package default_static;

@FunctionalInterface
public interface InterfaceExample2 {

    void method2();

    default void log(String val){
        System.out.println("Interface2 log::"+ val);
    }

}
