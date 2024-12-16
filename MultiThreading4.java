/* 
A yield() method is a static method of Thread class and 
it can stop the currently executing thread and will give a chance to other waiting threads of the same priority.
Allow us to run another thread . Which has same priority by pause it’s current threads.*/
class A extends Thread {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 1; i <= 3; i++) {

            System.out.println(">" + name);
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
        }

    }
}

public class MultiThreading4 {
    public static void main(String[] args) {// main method will call the JVM to terminate
        A T1 = new A();// creating the object of thread class
        A T2 = new A();// T1 AND T2 object of A class not(because A class extended Thread class tahts
                       // why we dont need to create any object for Thread class) Thread class sharing
                       // the same resouces i.e Thread class

        T1.setName("T1");
        T2.setName("T2");
        // T1.setPriority(2);
        // T2.setPriority(6);
        T1.start();
        System.out.println(T1.isAlive());// If we use isAlive() before the start then it will print false but after the
                                         // start method it will print true.
        // .isAlive() is start or not
        System.out.println(T2.isAlive());// it simply says that T2 hasnt started yet thats it is swowing false
        T2.start();
        /*
         * The isAlive() method of thread class tests if the thread is alive.
         * A thread is considered alive when the start() method of thread class has been
         * called and the thread is not yet dead. This method returns true if the thread
         * is still running and not finished.
         * 
         * Is thread isAlive then it will return true otherwise false.
         * If we use isAlive() before the start then it will print false but after the
         * start method it will print true.
         */

        // T2.stop();// it was present until java 1.2 version then it deprecated
        /*
         * Exception in thread "main" java.lang.NoSuchMethodError: 'void
         * A.setName(java.lang.String)'
         * at MultiThreading4.main(MultiThreading4.java:28)
         */

        // warning: [removal] stop() in Thread has been deprecated and marked for
        // removal
        // To stop T2 gracefully using an interrupt

    }
}