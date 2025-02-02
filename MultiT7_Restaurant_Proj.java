public class MultiT7_Restaurant_Proj {
    static class Kitchen extends Thread {

        public static void display() {
            System.out.println("Ladies and Gentlemen, Hello! and Welcome to my Restaurant (yeh prem ki katha hai)");
        }

        public static void main(String[] args) {

            final String Lock = "LOCK";

            // New concept or way to implement multitasking And that is by using runable
            // class interface
            Runnable runnable = new Runnable() {// at a time only one thread/process can enter
                public static void prepareFood() {
                    System.out.println("within the kitchen " + Thread.currentThread().getName());

                    // synchronized block is a type of object which means that we have any object
                    // that is being shared by all Across the thread
                    synchronized (Lock) {// synchronized ("critical section")oven now all the employees can enter there
                        System.out.println("Food preparation: Started " + Thread.currentThread().getName());

                        try {
                            Thread.sleep(3000); // Simulate food preparation time
                        } catch (InterruptedException e) {// synchronized block is better than synchronized method
                            e.printStackTrace();
                        }

                        System.out.println("Food preparation: Done " + Thread.currentThread().getName());

                    }

                };

                @Override // not entending thread thats why ae are proving run method here
                public void run() {// abstract method

                    long myCustomerNumber = Thread.currentThread().getId();
                    System.out.println("Customer " + myCustomerNumber + ": The order has taken");
                    prepareFood();
                    // Add a 2-second delay before serving food to each customer
                    try {
                        Thread.sleep(2000); // Wait for 3 seconds
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Customer " + myCustomerNumber + ": Food is served");

                }
            };

            Thread T1 = new Thread(runnable);
            T1.start();
            display();
            Thread T2 = new Thread(runnable);
            T2.start();

        }
    }
}/*
  * Output:
  * the order has been takenThread-1
  * the order has been takenThread-0
  * within the kitchen Thread-0
  * within the kitchen Thread-1
  * Food preparation: Started Thread-0
  * Food preparation: Done Thread-0
  * Food preparation: Started Thread-1
  * Food preparation: Done Thread-1
  * 
  * In the first code snippet:
  * 
  * java
  * Copy code
  * public class MultiT7_Restaurant_Proj {
  * static class Kitchen extends Thread {
  * // ...
  * }
  * 
  * public static void main(String[] args) {
  * // ...
  * }
  * } // This is the end of the class
  * In the second code snippet:
  * 
  * java
  * Copy code
  * public class MultiT7_Restaurant_Proj {
  * static class Kitchen extends Thread {
  * // ...
  * }
  * } // This is the end of the class
  * 
  * public static void main(String[] args) {
  * // ...
  * }
  * The main difference is in the placement of the closing brace for the Kitchen
  * class. In the first code snippet, the closing brace is outside of the Kitchen
  * class, while in the second code snippet, it is inside the Kitchen class. The
  * indentation and formatting are different.
  * 
  * The second code snippet, with the closing brace for the Kitchen class inside
  * the class, is the correct placement for proper Java syntax. The first code
  * snippet is not correctly formatted and may result in a compilation error.
  * 
  * What was happening first was people are coming and getting their food done
  * and take it to their home and eat it. But they don'tget able to eat the food
  * at the restaurantSo we are having a cheer table here so they can haveit as it
  * here.
  * 
  * RESTAURANT
  * [------------------------------------------------------------------------]
  * [ BURGER[ []OVEN ]KITCHEN(1){CHIEF} 23 ]
  * [ ]=CUSTOMERS
  * [ ]
  * [ ]
  * [------------------------------------------------------------------------]
  * 
  * 3-WEEK
  * RESTAURANT
  * [------------------------------------------------------------------------]
  * [ BURGER[ []OVEN ]KITCHEN(1){CHIEF} MOMO[]4 23{employes} ]
  * [ ]
  * [ ()()()()()()()()()() ]
  * [ ____________________ ]
  * [ ]
  * [ ( ) ( ) ( ) ]
  * [ | |5{CUSTOMERS} | |6{CUSTOMERS} | |7{CUSTOMERS} ]
  * [------------------------------------------------------------------------]
  * ( )IT IS TABLE
  * | |IT IS CHAIN
  * NUMBER(1,2,3)ARE THE PERSONS
  * ()()()()()()()()()()MOMOS(TOTAL MOMOS)THE PRODUCER WILL PRODUCE THE MOMOS
  * HERE THE LIMIT IS 10
  * ____________________PLATE(CRITICAL SECTION)
  * SIGNAL COMMUNICATION
  * WAIT=RED SIGNAL
  * NOTIFYALL = GREEN SIGNAL
  */
