//join method
/*
join(): When the join() method is invoked, the current thread stops its execution and the thread goes into the wait state. 
The current thread remains in the wait state until the thread on which the join() method is invoked has achieved its dead state. If interruption of the thread occurs, then it throws the InterruptExeption

Throws an checked exception.
Purpose of using Is to put a thread into a temporary waiting state. 
*/
class A extends Thread {// A is a thread class which impliment the multithreading.
    @Override // A is inheriting the thread class
    // run method is difined in runnable class. Runnable is an Interface
    public void run() // run() method is a override method. override method cannot throw an exception.
                      // inside the thread class
    {// run() is an abstract class. It is a main process/method.run() is a predefined
     // method inside Thread class
     // if we want to use thread class then we have to use run method inside the
     // Thread class

        String name = Thread.currentThread().getName();// the current thread sechiduled by the cpu* to get the names of
                                                       // the thread
        for (int i = 1; i <= 3; i++) {// thread will execute 3 times
            System.out.println("Thread:" + name);

        }

    }

}
/*
 * @override
 * public void run(){// run() method is a predefined method
 * if (target != null){//true
 * target.run();}//target is just equal to as there program inside the run
 * method or not
 * }// target is a type of anonymous class
 */ // target is pointing a class here

public class MultiThreading2_ {
    public static void main(String[] args) {// main method will call the JVM to terminate
        A T1 = new A();// creating the object of thread class
        A T2 = new A();// T1 AND T2 object of A class not(because A class extended Thread class tahts
                       // why we dont need to create any object for Thread class) Thread class sharing
                       // the same resouces i.e Thread class

        T1.setName("T1");
        T2.setName("T2 " + T2);// ITS CATCHING THE CURRENT EXECUTABLE THREAD NAME PRINTING IT THROUGH THE FOR
                               // LOOP

        T2.start();// Ready state to Running state
        try {
            T2.join();// we kept it in try block because it provides an exception
        } catch (InterruptedException erruption) {// exception handling
            erruption.printStackTrace();

        }
        // join () method will stop the execution of T2 thread for now then these
        // remaining threads like T2 will back from running state to waiting state
        // join methods resumes the execution of remaining threads when it complite the
        // execution of current thread(T2) waiting state--->running state
        /*
         * if you check the output
         * you see that T2 i.e current thread is executed first
         * this is the working of join()method
         * Output:
         * Thread:T2 Thread[#22,Thread-1,5,main]
         * Thread:T2 Thread[#22,Thread-1,5,main]
         * Thread:T2 Thread[#22,Thread-1,5,main]
         * Child Main Thread jobs main
         * Thread:T1
         * Thread:T1
         * Thread:T1
         * Child Main Thread jobs main
         * Child Main Thread jobs main
         * Child Main Thread jobs main
         * Child Main Thread jobs main
         * 
         * basically it send t2 to come first then t1
         */
        T1.start();// now the thread is start. start()is a predifined. start() is inside the Thread
                   // class. This start() method is associated with the T1 object,T1 is the
                   // reference.
        // T1.run(); // it does the same work as T1.start();. An actual thread is T1

        for (int i = 1; i <= 5; i++) {// for {} is a sub process
            System.out.println("Child Main Thread jobs " + Thread.currentThread().getName());
            // cpu execute thread there is no sequence or order for the output

        }
    }

}
