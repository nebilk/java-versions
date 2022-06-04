package function;

public class RunnableDemo {

    public static void main(String[] args) {
        Runnable runnable1 = () -> System.out.println("Runnable1 running ");
        Runnable runnable2 = () -> System.out.println("Runnable2 running ");

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();

    }
}
