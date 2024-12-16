/*

The suspend() method of thread class puts the thread from running to waiting state. 
This method is used if you want to stop the thread execution and start it again when a certain event occurs. This method allows a thread to temporarily cease execution. The suspended thread can be resumed using the resume() method.

The resume() method of thread class is only used with suspend() method. 
This method is used to resume a thread which was suspended using suspend() method(suspend thread from waiting to running state). This method allows the suspended thread to start again.*/
class A extends Thread {// A is a thread class which impliment the multithreading.
    @Override // A is inheriting the thread class
    // run method is difined in runnable class. Runnable is an Interface
    public void run() // run() method is a override method. override method cannot throw an exception.
                      // inside the thread class
    {// run() is an abstract class. It is a main process/method.run() is a predefined
     // method inside Thread class
        // if we want to use thread class then we have to use run method inside the
        // Thread class

        String name = Thread.currentThread().getName();// the current thread sechiduled by the cpu*
        for (int i = 1; i <= 3; i++) {// thread will execute 3 times
            System.out.println("Thread:" + name);

        }

    }

}

public class MultiThreading3 {
    public static void main(String[] args) {// main method will call the JVM to terminate
        A T1 = new A();// creating the object of thread class
        A T2 = new A();// T1 AND T2 object of A class not(because A class extended Thread class tahts
                       // why we dont need to create any object for Thread class) Thread class sharing
                       // the same resouces i.e Thread class

        T1.setName("T1");
        T2.setName("T2 " + T2);// ITS CATCHING THE CURRENT EXECUTABLE THREAD NAME PRINTING IT THROUGH THE FOR
                               // LOOP

        T1.start();// now the thread is start. start()is a predifined. start() is inside the Thread
                   // class. This start() method is associated with the T1 object,T1 is the
                   // reference.
        // T1.run(); // it does the same work as T1.start();. An actual thread is T1
        T2.start();// Ready state to Running state
        T2.suspend();// java stop using it thats why it is showing like this way
        // warning: [removal] suspend() in Thread has been deprecated and marked for
        // removal
        T2.resume();
        // warning: [removal] resume() in Thread has been deprecated and marked for
        // removal
        for (int i = 1; i <= 5; i++) {// for {} is a sub process
            System.out.println("Child Main Thread jobs " + Thread.currentThread().getName());
            // cpu execute thread there is no sequence or order for the output

        }
    }
}
