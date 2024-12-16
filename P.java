
    //import java.util.concurrent.locks.Lock;

import java.util.LinkedList;
import java.util.Queue;

//import javax.management.QueryExp;

public class P{// PRODUCER CONSUMER PROBLEM
    static Object key = new Object();// COLLECTION FRAMEWORK LL,STACK,QUEUE
    // (PREDEFINED CLASS)QUEUE:MOMO PLATE<RAPPER CLASS> REFERENCE = new Instance
    // LinkedList_class
    static Queue<Integer> queue = new LinkedList<Integer>();
    // NO OF MOMO ITEMS
    static int size_of_momos = 10;

    public static void main(String[] args) {
        // PRODUCER THREAD
        // creating object(reference)=creating instance((constructor)(class)(Interface))
        Thread PRODUCER = new Thread(new Runnable() {

            @Override
            public void run() {
                int count = 0;// no of momo
                while (true) {
                    synchronized (key) {// LoCK variable only permits a single thread to enter in the critical section.
                                        // If any other thread try to enter in the critical section while running a
                                        // thread on the critical section then it's block the other thread from entering
                                        // into it, because there is already one thread currently running in the
                                        // critical section.

                        while (queue.size() == size_of_momos) {
                            try {
                                key.wait();//WAIT=RED SIGNAL
                            // INSERT ITEM
                            queue.offer(count++);
                            key.notifyAll();//NOTIFYALL = GREEN SIGNAL
                            System.out.println("MOMO PRODUCER" + ",PLATE SIZE" + queue.size());
                            
                                Thread.sleep(3000);
                            }catch (InterruptedException e) {
                                
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        });

        // CONSUMER THREAD
        Thread CONSUMER = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (key) {

                        while (queue.size() == 0) {
                            try {
                                key.wait();//WAIT=RED SIGNAL
                            } catch (InterruptedException e) {
                                
                                e.printStackTrace();
                            }//We can keep this code in single or 2 trYblock

                            // INSERT pop FROM QUEUE
                            // Consume (remove) an item from the queue
                            queue.poll();
                            key.notifyAll();//NOTIFYALL = GREEN SIGNAL
                            System.out.println("MOMO CONSUMED" + ",PLATE SIZE" + queue.size());
                            try {
                                Thread.sleep(1000);// EATING TIME EACH MOMO
                            } catch (InterruptedException ex) {
                                ex.printStackTrace();
                            }
                        }
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


