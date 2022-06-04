package functional_interface;

public class RunnableDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable demo");
    }
}
