
// India has the third largest startup ecosystem in the world.in the 2030 India will be the largest startup ecosystem in the world
// for now, China is the largest startup ecosystem in the world under 30 age
//restaurant name
    /*Error: Main method not found in class MultiThreading7_P, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application */
// Psvm is the main thread(sub process).Critical section is basically a type of path Where the actual activity or task is performed Which is present inside the process(actual problem)
public class MultiT7_Restaurant_P/*roject */  {
    // Static nested class representing the Kitchen
    public static class Kitchen extends Thread {
        @Override
        public void run() {
            // Get the unique customer number (thread ID)
            long myCustomerNumber = Thread.currentThread().getId();
            System.out.println("Customer " + myCustomerNumber + ": The order has taken");
            prepareFood();

            // Add a 2-second delay before serving food to each customer
            try {
                Thread.sleep(2000); // Wait for 3 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Customer " + myCustomerNumber + ": Food is served");/*Customer 21: Food is served
            Customer 22: Food is served To make this output three seconds delay */
        }
    
 //static method 
 /*static*/ // here static is optional
    // Static method to display a restaurant welcome message
    public static void display() {
        System.out.println("Ladies and Gentlemen, Hello! and Welcome to my Restaurant (yeh prem ki katha hai)");
    }

    // Static method representing food preparation in the Kitchen
    public static synchronized void prepareFood() {//synchronized method
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

        // Display the restaurant welcome message
        T1.display();

        // Start the customer threads (Kitchen instances)
        T1.start();//Here, multiple threads are entering into the run section concurrently. So all the threads are executing at the same timeBut to prevent this, we canuse a method name synchronisationwhich is present in Java to solve this problem
        T2.start();
         //customer 1
//T1.prepareFood();//We are facing a problem here is that receiving of food orders 1s tcustomer ordering the foodthen getting the food done. After then, the order of the next food is received by the owner or by the cook. So that is the problem we are having, what we should do is making sure that every customer present front of the restaurant can give orders at a time Then they can wait for receiving the food they ordered for
    }
}//Concurrent processing is the another name of synchronisation problemWhenever we are implementing the multithreading concept that time All our multi thread in our programme together Insert the run method
