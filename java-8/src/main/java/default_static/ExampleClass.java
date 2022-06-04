package default_static;

public class ExampleClass implements InterfaceExample1, InterfaceExample2{
    @Override
    public void method(String val) {

    }

    @Override
    public void method2() {

    }

    @Override
    public void log(String val) {
        System.out.println("ExampleClass log::"+val);
        InterfaceExample1.print(val);
        InterfaceExample1.super.log(val);
        InterfaceExample2.super.log(val);
    }
}
