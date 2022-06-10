package functional_interface;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        Addable addable = (a, b) -> a + b;
        System.out.println(addable.add(1, 4));
        addable.def_method1();
        addable.def_method2();
        Addable.static_method1();
        Addable.static_method2();

        Drawable drawable = () -> System.out.println("Drawing");
        drawable.draw();

        Painter painter = val -> System.out.println("Painter interface val : " + val);
        painter.paint("painter value");
    }
}
