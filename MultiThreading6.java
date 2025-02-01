/*
java.lang.Thread
A thread is a thread of execution in a program. The Java virtual machine allows an application to have multiple threads of execution running concurrently.

Thread defines constructors and a Builder to create threads. Starting a thread schedules it to execute its run method. The newly started thread executes concurrently with the thread that caused it to start.

A thread terminates if either its run method completes normally, or if its run method completes abruptly and the appropriate uncaught exception handler completes normally or abruptly. With no code left to run, the thread has completed execution. The join method can be used to wait for a thread to terminate.

Threads have a unique identifier and a name. The identifier is generated when a Thread is created and cannot be changed. The thread name can be specified when creating a thread or can be changed at a later time.

Threads support ThreadLocal variables. These are variables that are local to a thread, meaning a thread can have a copy of a variable that is set to a value that is independent of the value set by other threads. Thread also supports InheritableThreadLocal variables that are thread local variables that are inherited at Thread creation time from the parent Thread. Thread supports a special inheritable thread local for the thread context-class-loader.

Platform threads
Thread supports the creation of platform threads that are typically mapped 1:1 to kernel threads scheduled by the operating system. Platform threads will usually have a large stack and other resources that are maintained by the operating system. Platforms threads are suitable for executing all types of tasks but may be a limited resource.

Platform threads get an automatically generated thread name by default.

Platform threads are designated daemon or non-daemon threads. When the Java virtual machine starts up, there is usually one non-daemon thread (the thread that typically calls the application's main method). The shutdown sequence begins when all started non-daemon threads have terminated. Unstarted non-daemon threads do not prevent the shutdown sequence from beginning.

In addition to the daemon status, platform threads have a thread priority and are members of a thread group.

Virtual threads
Thread also supports the creation of virtual threads. Virtual threads are typically user-mode threads scheduled by the Java runtime rather than the operating system. Virtual threads will typically require few resources and a single Java virtual machine may support millions of virtual threads. Virtual threads are suitable for executing tasks that spend most of the time blocked, often waiting for I/O operations to complete. Virtual threads are not intended for long running CPU intensive operations.

Virtual threads typically employ a small set of platform threads used as carrier threads. Locking and I/O operations are examples of operations where a carrier thread may be re-scheduled from one virtual thread to another. Code executing in a virtual thread is not aware of the underlying carrier thread. The Thread.currentThread() method, used to obtain a reference to the current thread, will always return the Thread object for the virtual thread.

Virtual threads do not have a thread name by default. The getName method returns the empty string if a thread name is not set.

Virtual threads are daemon threads and so do not prevent the shutdown sequence from beginning. Virtual threads have a fixed thread priority that cannot be changed.

Creating and starting threads
Thread defines public constructors for creating platform threads and the start method to schedule threads to execute. Thread may be extended for customization and other advanced reasons although most applications should have little need to do this.

Thread defines a Builder API for creating and starting both platform and virtual threads. The following are examples that use the builder:

   Runnable runnable = ...

   // Start a daemon thread to run a task
   Thread thread = Thread.ofPlatform().daemon().start(runnable);

   // Create an unstarted thread with name "duke", its start() method
   // must be invoked to schedule it to execute.
   Thread thread = Thread.ofPlatform().name("duke").unstarted(runnable);

   // A ThreadFactory that creates daemon threads named "worker-0", "worker-1", ...
   ThreadFactory factory = Thread.ofPlatform().daemon().name("worker-", 0).factory();

   // Start a virtual thread to run a task
   Thread thread = Thread.ofVirtual().start(runnable);

   // A ThreadFactory that creates virtual threads
   ThreadFactory factory = Thread.ofVirtual().factory();

Inheritance when creating threads
A Thread inherits its initial values of inheritable-thread-local variables (including the context class loader) from the parent thread values at the time that the child Thread is created. The 5-param constructor can be used to create a thread that does not inherit its initial values from the constructing thread. When using a Thread.Builder, the inheritInheritableThreadLocals method can be used to select if the initial values are inherited.

Platform threads inherit the daemon status, thread priority, and when not provided (or not selected by a security manager), the thread group.

Creating a platform thread captures the caller context to limit the permissions of the new thread when it executes code that performs a privileged action. The captured caller context is the new thread's "Inherited AccessControlContext". Creating a virtual thread does not capture the caller context; virtual threads have no permissions when executing code that performs a privileged action.

Unless otherwise specified, passing a null argument to a constructor or method in this class will cause a NullPointerException to be thrown.

Since:

1.0
@implNote

In the JDK Reference Implementation, the virtual thread scheduler may be configured with the following system properties:

System property	Description
jdk.virtualThreadScheduler.parallelism	The number of platform threads available for scheduling virtual threads. It defaults to the number of available processors.
jdk.virtualThreadScheduler.maxPoolSize	The maximum number of platform threads available to the scheduler. It defaults to 256.
 
java.lang.Override
Indicates that a method declaration is intended to override a method declaration in a supertype. If a method is annotated with this annotation type compilers are required to generate an error message unless at least one of the following conditions hold:

The method does override or implement a method declared in a supertype.

The method has a signature that is override-equivalent to that of any public method declared in Object.

Since:

1.5
Author:

Peter von der Ahé

Joshua Bloch

@jls

void A.run()
This method is run by the thread when it executes. Subclasses of Thread may override this method.

This method is not intended to be invoked directly. If this thread is a platform thread created with a Runnable task then invoking this method will invoke the task's run method. If this thread is a virtual thread then invoking this method directly does nothing.

java.lang.String
The String class represents character strings. All string literals in Java programs, such as "abc", are implemented as instances of this class.

Strings are constant; their values cannot be changed after they are created. String buffers support mutable strings. Because String objects are immutable they can be shared. For example:

String str = "abc";
is equivalent to:

char data[] = {'a', 'b', 'c'};
     String str = new String(data);
     
     void java.io.PrintStream.println(String x)
Prints a String and then terminates the line. This method behaves as though it invokes print(String) and then println().

Parameters:

x The String to be printed.

PrintStream out
The "standard" output stream. This stream is already open and ready to accept output data. Typically this stream corresponds to display output or another output destination specified by the host environment or user. The encoding used in the conversion from characters to bytes is equivalent to Console.charset() if the Console exists, stdout.encoding otherwise.

For simple stand-alone Java applications, a typical way to write a line of output data is:

System.out.println(data)
See the println methods in class PrintStream.

See Also:

java.io.PrintStream.println()

java.lang.System
The System class contains several useful class fields and methods. It cannot be instantiated. Among the facilities provided by the System class are standard input, standard output, and error output streams; access to externally defined properties and environment variables; a means of loading files and libraries; and a utility method for quickly copying a portion of an array.

Since:

1.0
*/
class A extends Thread {
    @Override
    public void run() {
       /* String n = Thread.currentThread().getName();
        System.out.println(n);*/
        String n = Thread.currentThread().getName();
        for (int i = 1; i <= 3; i++) {
            System.out.println(n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
              
                e.printStackTrace();
            }
    }
}}
/*class B extends Thread {
    @Override
    public void run() {
        String n = Thread.currentThread().getName();
       // System.out.println(n);
        for (int i = 1; i <= 3; i++) {
            System.out.println(n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
              
                e.printStackTrace();
            }
    }
}}*/
public class MultiThreading6  {
    public static void main(String[] args) {      
    
    A T1 = new A();
    A T2 = new A();
   
    T1.setName("Thread1");
    T2.setName("Thread2");
   
    T1.setPriority(2);//we are setting the default priority range 1-10(positive integer)
    T2.setPriority(6);//range 1-10(positive integer)
    //ariving race condition-never comes desired output

    T1.start();
    T2.start();

   /*  B T3 = new B();
    T3.setName("thread3");
    T3.setPriority(7);
    T3.start();*/
  

    String n = Thread.currentThread().getName();
    for(int i=1;i<=3;i++){
        
        System.out.println(n);
    }

}
}
