public class MultiThreading extends Thread {
    public static void main(String[] args) {
        MultiThreading thread1 = new MultiThreading();
        thread1.start();

        MultiThreading thread2 = new MultiThreading();
        thread2.start();
    }

    @Override
    public void run() {
        System.out.println("Hello, world!");
    }
}
/*This is because the two threads are executing the run() method at the same time. */
