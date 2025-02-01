
import java.util.LinkedList;
import java.util.Queue;


public class Practice {
    static Object key = new Object();
    static Queue<Integer> queue = new LinkedList<>();
    static int size_of_momos = 10;

    public static class Kitchen extends Thread {
        @Override
        public void run() {
            long myCustomerNumber = Thread.currentThread().getId();
            System.out.println("Customer " + myCustomerNumber + ": The order has taken");
            prepareFood();
            
            try {
                Thread.sleep(2000); // Wait for 2 seconds before serving food
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            System.out.println("Customer " + myCustomerNumber + ": Food is served");
        }

        public synchronized void prepareFood() {
            System.out.println("Food preparation: Started");
            System.out.println(Thread.currentThread().getName()); // Currently, executable thread

            try {
                Thread.sleep(3000); // Simulate food preparation time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Food preparation: Done");
        }

        public static void display() {
            System.out.println("Ladies and Gentlemen, Hello! and Welcome to my Restaurant (yeh prem ki katha hai)");
        }
    }

    public static void main(String[] args) {
        Kitchen T1 = new Kitchen();
        Kitchen T2 = new Kitchen();

        T1.display();

        T1.start();
        T2.start();

        Thread PRODUCER = new Thread(new Runnable() {
            @Override
            public void run() {
                int count = 0;
                while (true) {
                    synchronized (key) {
                        while (queue.size() == size_of_momos) {
                            try {
                                key.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        queue.offer(count++);
                        System.out.println("MOMO PRODUCER, PLATE SIZE " + queue.size());
                        key.notifyAll();
                    }
                }
            }
        });

        Thread CONSUMER = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (key) {
                        while (queue.isEmpty()) {
                            try {
                                key.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        queue.poll();
                        System.out.println("MOMO CONSUMED, PLATE SIZE " + queue.size());
                        key.notifyAll();
                    }
                }
            }
        });

        PRODUCER.start();
        CONSUMER.start();
    }
}

   /* 

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
 * 
 * Exception in thread "main" java.lang.ExceptionInInitializerError
 * Caused by: java.lang.NullPointerException: Cannot invoke
 * "java.util.Collection.toArray()" because "c" is null
 * at java.base/java.util.LinkedList.addAll(LinkedList.java:412)
 * at java.base/java.util.LinkedList.addAll(LinkedList.java:391)
 * at java.base/java.util.LinkedList.<init>(LinkedList.java:123)
 * at MultiT8_Rest_ProCon_PROB.<clinit>(MultiT8_Rest_ProCon_PROB.java:11)
 */



    

