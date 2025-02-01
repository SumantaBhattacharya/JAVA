public class MultiT7_Restaurant_Pr {
    static class Kitchen extends Thread {
        @Override
        public void run() {
            System.out.println("Customer " + ": The order has taken");
            prepareFood();

        }

        public static void display() {
            System.out.println("Ladies and Gentlemen, Hello! and Welcome to my Restaurant (yeh prem ki katha hai)");
        }

        // Static method representing food preparation in the Kitchen
        public static synchronized void prepareFood() {// synchronized method
            System.out.println("Food preparation: Started");
            System.out.println(Thread.currentThread().getName()); // Currently, executable thread

            try {
                Thread.sleep(3000); // Simulate food preparation time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Food preparation: Done");

        }
    }

    // Main method where the program starts
    public static void main(String[] args) {
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
