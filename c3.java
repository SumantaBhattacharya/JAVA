
//method
/* 
A yield() method is a static method of Thread class and 
it can stop the currently executing thread and will give a chance to other waiting threads of the same priority.
Allow us to run another thread . Which has same priority by pause it’s current threads.*/
class A extends Thread {
    @Override
    public void run() {
        String n = Thread.currentThread().getName();
        for (int i = 1; i <= 3; i++) {
            if (Thread.interrupted()) {
                System.out.println(n + " interrupted. Exiting...");
                return;
            }
            System.out.println(n);
        }
    }
}
/*
 * T2
 * T1
 * T1
 * T1
 * T2
 * T2
 * see that T2 stops and then executed at last but there are very low chances of
 * giving this output
 */

public class c3 {
    public static void main(String[] args) {// main method will call the JVM to terminate
        A T1 = new A();// creating the object of thread class
        A T2 = new A();// T1 AND T2 object of A class not(because A class extended Thread class tahts
                       // why we dont need to create any object for Thread class) Thread class sharing
                       // the same resouces i.e Thread class
        T1.setName("T1");
        T2.setName("T2");
        T1.start();
        T2.start();
        // T2.stop();// it was present until java 1.2 version then it deprecated
        /*
         * Exception in thread "main" java.lang.NoSuchMethodError: 'void
         * A.setName(java.lang.String)'
         * at MultiThreading4.main(MultiThreading4.java:28)
         */

        // warning: [removal] stop() in Thread has been deprecated and marked for
        // removal
        // To stop T2 gracefully using an interrupt
        T2.interrupt();

    }
}
