package lambda;

public class LambdaDemo {

    public static void main(String[] args) {
        Drawable drawable = new Drawable() {
            @Override
            public void draw() {
                System.out.println("draw");
            }
        };
        drawable.draw();

        drawable = () -> System.out.println("draw in lambda");
        drawable.draw();


        Painter painter = new Painter() {
            @Override
            public void paint(String view) {
                System.out.println("paint");
            }
        };
        painter.paint("profile");
        painter = (name) -> System.out.println("Lambda profile::" + name);
        painter.paint("test");

        Addable addable = (a, b) -> a + b;
        System.out.println(addable.add(1, 4));

    }
}
