public class MultiT7_Restaurant_Pro {
    static class Kitchen extends Thread {

        public static void display() {
            System.out.println("Ladies and Gentlemen, Hello! and Welcome to my Restaurant (yeh prem ki katha hai)");
        }

        static String lock = "LOCK";// reference.it stops entering thread from entering into the critical
                                    // section.lock working as a global variable can be accessible to both thread
                                    // and kitchen class
        // Static method representing food preparation in the Kitchen

        public static /* synchronized */ void prepareFood() {
            System.out.println("within the kitchen " + Thread.currentThread().getName());

            // synchronized block is a type of object which means that we have any object
            // that is being shared by all Across the thread
            synchronized (lock) {// synchronized ("critical section")oven now all the employees can enter there

                System.out.println("Food preparation: Started " + Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getName()); // Currently, executable thread

                try {
                    Thread.sleep(3000); // Simulate food preparation time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Food preparation: Done " + Thread.currentThread().getName());
            }

        }

        @Override
        public void run() {
            System.out.println("Customer " + ": The order has taken");
            prepareFood();

        }
    }

    // Main method where the program starts
    public static void main(String[] args) {

        String Lock = "LOCK";
        // New concept or way to implement multitasking And that is by using runable
        // class interface
        Runnable runnable = new Runnable() {
            @Override
            public void run() {// abstract method

            }
        };
        // Create instances of the Kitchen (customers)
        Kitchen T1 = new Kitchen();
        Kitchen T2 = new Kitchen();
        T1.display();

        // Start the customer threads (Kitchen instances)
        T1.start();// Here, multiple threads are entering into the run section concurrently. So all
                   // the threads are executing at the same timeBut to prevent this, we canuse a
                   // method name synchronisationwhich is present in Java to solve this problem
        T2.start();
        // After completion of the food of the first customerthen the food of the next
        // customeris started making This is whatwe objected to make our program
        // for.Because there is only one oven One foot will be prepared at a time.
        // concurrency problem controlled through synchronisation
    }
}
