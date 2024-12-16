/*
  Operating system Acts as an interface between user and hardware
  Operating system Is a system software
  Software is a collection of programmes. And programme is a set of instructions
  System software operates the computer hardware or provide platform for application software
  Operating system Provides a graphical user interface used for windows Operating system 
  Characteristics 1 resource managementto  i) CPU Management ii) Memory Management iii) IO device management. 
  2 process management. 
  three) storage management
  
GOALS OF Operating system
One convenience 
2. efficiency

Types of Operating system
1. Batch Operating system
2. Multiprogramming Operating system or Time Sharing Operating system
3. Multitaking Operating system*
4. Multiprocessing Operating system
5. Real time Operating system
6. Destributed Operating system
7. Embeded Operating system

1. Batch Operating system
through punch card we operate 'Batch' Operating system 
It is a combination of mutiple jobs
[.]-1 light pass
[.]-0 light not pass

(user1)------JOB------>(        )-------job---->Batch--->[           ]
(user2)------JOB------>(OPERATOR)-------job---->patch--->[ Computer  ]
(user3)------JOB------>(        )
(user4)------job------>(        )

Batch Operating system Does not communicate or interact with the computer directly
Batch Operating system Is helpful when computer processes are very lengthy and time consuming
Batch Operating system Speed up the process by combining together similar types of jobs and runs them as a group
Example bank system , payroll system

Process is a running programme that serves as the foundation for all computation.

2)Multiprogramming Operating system Example Google Chrome X Excel, Firefox browser
Features of Multiprogramming Operating system:-
1. CPU utilisation 
2. we cannot remove any process while executing and allocate to C P U

[p1][p2][p3][p4][p5]-->[CPU]
|                        |
-------------------------

3)Multitasking Operating system
 ----[p1][p2][p3][p4]--->[CPU]
|  |      |                ^
|  |      -----------------|
|  |
|  -----------><
|             |
---------------
3.1 multiprocessing 3.2 multithreading
Here we can remove an process during execution And that process returns back to its position. And the next process start executing. Each task is allocated sometime to execute its work after the allotted time interval is over. The operation switches to the next task eg Unix Operating system

4.EMEDDED Operating system - These systems are specialised and designed to perform a particular task for a given device that is NOT A computer

5.Multiprocessing Operating system
clients<------->CPU[file server]<----->-clients
clients<---------->[           ]<----->-clients

5.Destributed Operating system
Multiple central processes are used by this system to serve multiple users and real time

(CPU memory)<------>(                       )<------>(C p u memory)
                    ( Communication Network )
(CPU memory)<------>(                       )<------>(C p u memory)

eg locus

Destributed Os(Operating system) system are two types
a.Client server system
This type of systems consist two types of components One client and two server
The client sends a request to the server, and the server responds to the request of the client
b.Peer to peer system
These types of system enables the user to access some resources that are shared from other's computer And enables to share resources from their computer

Real time Operating system 
Response should be Guaranteed within a specific timing
[Appilications]<-->[RTDS KERNAL][BSP]<-->[Custom Hardware]

Types of Real time Operating system 

a. Hard Real time Operating system  
The time constraint is very strict
b. Soft Real time Operating system 
The time constraint is not strict

[hll]-->[compiler]--object files--->[linker]---Executable code--->[loader]--->[memory]cpu execute
          --->[Assembly code]Assembler--->[Object file]
    
object file 
Header
Text section
Data section <---global,local variables, constants
BSS section
symbal section <---functions
Relocation information <---Relative address
Debugging information 

There are 2 types of Programming languages high level language and low level language 
low level programming language Types one machine language 2 assembly language
Machine language is a lower level programming language which is compiled of binary digits 1to0 machine language is not human readable
Machine language execution time is very fast
Assembly language is a low level programming language which is human readable and execution time is slow
Assembly language converts into machine language by the assembler and then execute
We use numbers symbols to write assembly languageMachine language and assembly language are both machine and hardware dependent
High level programming language examples C plus plus C programming Java JavaScript Python
hll language is a human readable high level language is execution time is slow
High level language is machine and hardware independent
 high level language converts into machine languageby the compiler or interpreter and then execute
Keywords are reserved words whose meaning is already defined by the compiler example integer float char
Compiler is a software program that converts high level source code into low level object code
Compiler scans the entire programme at once
comPiler based programming languages are C&C plus plus
Interpreter is a software program that converts high level source code into intermediate code intermediate code is used to translate source code into machine code and then convert it into machine code 
interpreter scans line by line statement of a program
Interpreted the execution time is slow and interpreter based programming languages are JavaScript Python

(2.)  Process management.(Processes and threads)
  How a programme is developed
  When we develop a programme we need to write the programme in hyper level language In short term, we call HLL Computer does not understand it.
  It only understands the machine level language in short term called MLl Which are from zero to one That is binary coded language So programmes are required to be converted to binary code for the execution
  We use compiler to compile our programme, and it helps to convert the programme into a machine codewhich is understandable by machine Then it converted into Binary executable code but it hasn't been Executed yet,
   It has to be loaded in the memory And for a programme to execute it it needs some resources of the computer system that is operating system 
  The operating system will help in loading the executable programme in the main memoryand allocate the resources and then the programme begins its execution
   Then it is known as a process
  The moment the programme begins its execution we call it a process
  In earlier computers, it supported only one process or one programme at a time. But in today's computers It supports multiple process and programmes running at the same time And a single programme can have many processes associated with it.

  Thread is actually the basic unit of a process which is in execution Or we can say thread is the unit of execution within a process
  Within a process, there may be one or more Units of its execution. And those unit of execution are known as threads.
  A process can have anywhere from just one threads to many threads
  In earlier systems one process had only one thread But now a single process can have multiple threads, or many units of execution within it
  |--------------------------------------|
  |          process                     |
  | Threads|Threads|Threads|Threads|     |
  |                                      |
  |--------------------------------------|

process state.
when a program executes it changes its states
When I process is executing it can change from one state to another And the state of process is defined by the current activity of that process

Each process may be in one of the following states
state               memory
1.New          The process is being created
2.Running      Instructions are being executed
3.Waiting      The process is waiting i/o operation
4.Ready        The process is waiting to be assigned to a processor(cpu)
5.Terminated   The process is terminated(finished its execution)

Diagram of process state
                           (NEW)                          (Terminated)
                            |      ---------------<----------  |Exit
                            |      |    interrupt           |  |
                            ->(Ready)------------------->(RUNNING)
                            ^         scheduler despair |
                            |                           |
i/o or Event complitation   |                           |
                         (Waiting)<--------------------- I/O event waiting

  PCB(process Control State)
  Each process is represented in Operating system by pcb
  Also known as task control block
  [process state]      There's the particular state in that process at a particular moment
  [process number]     It shows the unique id of a particular process
  [program counter]    Indicates the address of the next instruction That has to be executed in particular process
  [cpu Register]       Cpu register tells us the registers that are being used by a particular process such as Stack Register Index Register general purpose registers, accumulated registers                 
  [Memory limits]      Cpu scheduling information has the priority of processes It has the pointer to the scheduling queue and also the other scheduling parameter(Scheduling determines the order in which the process has to be executed. There may be processes with higher priority than other processes so they may Have to be executed first) When process are all waiting in the queue, it has to determine how much time has to beDo a particular process
  [list of open files] Memory management information It represent the memory that is being used by a particular process
Accounting informationit keeps an account of all those resources which are being used by a particular processfor its execution
Are you status information represent? Which are the IO devicesthat are assigned to a particular process(A process during its execution, it may need to use I/O devices)

Process scheduling
The objective of multi programming is to have some process running at all times to maximise cpu utilisation
The objective of time sharing is to switch the cpu among processes so frequently that users can interact with each programme while it is running
To meet these objectives, the process scheduler selects an available process for programme execution on the cpu Basically, schedulers lets an available process and assign it to the cpu so that it can begin its execution
For a single processor system, there will never be more than one running process There will be only one single process earning at a particular time.But the CPu is switches so frequently among the processes we cannot even realise that
If there are more processes, the rest of the process will have to wait until the cpu is free and can be rescheduled

To help process scheduling We have the scheduling queues
1.job queue:List of all processes
2.Readu queue:List of processes that are ready and waiting for the cpu to be executed

     swap in---[Partially executed swapped out processes]<-------------Swap out
            |                                                         | for high priority
            |---->[           ]               (             )----------
job queue-->prcess[Ready queue]-------------->(CPU          )---------------------------->CPU(executed)
(program)   ^---->[           ]               (Running state)  
            |                                    |
            -------(i/o)<--[i/o waiting queues]<--Need for I/o divices

Operations on processes
(Process creation)

A process that is parent process may create several new child processes via a create process system call, during the course of execution
Each of these new processes becomes apparent and may create other child processes, forming a tree of processes.
Process ID in short term, which is called PID A tree of processes on a solaris system
In it will serve as the parent for all the processes that will created by the user

When a process creates a new process there are two possibilities exist in terms of execution

1.The parent continues to execute concurrently with their child or children processes
2.The parents waits until some are all of its childrens Have terminated Or executed first 

When a process creates a new process, there are 2 possibilities in terms of the address space of the new process
1.The child process Is a duplicate of the parent process(It has the same programme and data as the parent)
2.The child process has a new programme loaded into it

instructions=jobs

Cpu scheduling 
cpu scheduling is the base of multiprogramming operating system
By switching the C p u among processes, the os Can make the computer more productive.
In a single processor system only one process can run at a time. Any other process must wait for the CPU is to be free, and can be rescheduled
the object of multiprogramming operating system Is to have some process running at all times to maximise cpu utilisation

When a process is executed it must wait for compilation of some io request
In a simple computer system, the CPUjust sits idle All this waiting time is wasted; no useful work is accomplished

with multiprogramming, we try to use this time productively.
When one process has to wait, the os Takes the cpu away from that process and gives the cpu to some other process that is kept in memory at a time. And this pattern continues

CPU and I/O Burst cycles
Process execution consists of a cycles of cpu execution and io operation wait. processes alternate between these two states
Cpu and io burst cycle are the time in which the process is cpu execution and i/o wait respectively
CPO burst is when the process is being executed in the CPU.
Are you burst is when the CPU is waiting for i/o operation for further execution

CPU burst and io burst cycle
The CPO burst that is followed by an IO burst, which is followed by another cpu burst, then another IO burst, and so on. Eventually, the final cpu burst ends with a system request to terminate execution.

Preemptive and non Preemptive scheduling
C p u scheduler
When the CPU becomes idle,The os must select one of its processes in the Ready queue i.e temporary buffer to be executed, The selection process is carried out by CPO scheduler. The scheduler selects a process from the available processes in the memory that are ready to Execute and allocate the cpu to the process
Dispatcher. The dispatcher is the module that gives control of the cpu to the process selected by the cpu scheduler
The time it takes to switch the CPUfrom one process to another is known as dispatch latency
C p u scheduling decisions may take place under these following four circumstances
When I process switches from the running state to the waiting state
When I process switches from the running state to the ready state for example, when an interrupt occurs

  Multitasking
    Multitasking is a process of executing multiple tasks simultaneously.
     we use multi tasking to utilise the cpu.

    Executing all the processes at the same time

    Multitasking can be achieved in two ways:
   * Process based multitasking(Multiprocessing)
   * thread based multitasking(Multithreading)
   
Process-Based Multitasking (it is also called multiprocessing*):-
Each process has an address in memory. In other words each process allocates a separate memory area.
A process is heavyweight.
Cost of communication between the process is high.
Switching from one process to another requires some time for saving and loading registers, memory maps(memory allocation), updating list(content update), etc.
context switching: when cpy execute from one process to another process simultaniously 

second way to achive multitasking:
Thread-Bades Multitasking(Multithreading):-
Threads share the same address space.
A thread is lightweight. 
Cost of communication between the thread is low

process has subprocess that is called thread

Difference between process and thread
Process                                                          Thread
A process is heavyweight.                                 A thread is lightweight.
when a process starts its execution it is called process. A thread is a smallest unit of execution within a process
Each process allocates a separate memory area/space.      Threads share the same address/memory space.
The process takes more time to terminate.                 The thread takes less time to terminate.
process takes more time for creation.	                  Thread takes less time for creation.
process takes more time for context switching.	          Thread takes less time for context switching.

What is thread in java? A thread is a lightweight sub process,The smallest unit of processing. It is a separate path of execution
Threads are independent.If there occurs exception in one thread, it doesn't affect other threads.It uses a shared memory area
As shown in the above figure, a thread is executed inside the process.There is context switching between the threads.There can be multiple processes inside os And one process can have multiple threads.

     ( process1(thread1--thread2  )    process2(thread1--thread2)      process3(thread1)  ) Operating system 
               ( |          |     )
shared memory  ( --thread3---     )


The JVM (Java Virtual Machine) is not a compiler;JVM stands for "Java Virtual Machine." 
It is a fundamental component of the Java platform, responsible for executing Java applications.
The role of the JVM is to take compiled Java bytecode and execute it on the underlying hardware and operating system. 

mutithreading is never implimented by its,It is implimented manually.

The main method that is psvm is itself a thread we call it Main thread.and... this main thread is controlled by JVM(Java Virtual Machine)

Main thread in Java
properties associated with the main thread in Java:
Entry point: The main thread acts as the main() method of the program, which is the entry point of the program.

Foreground thread: The main thread is a foreground thread, which means that the program will not exit(terminate) until the main thread finishes its execution.

Single thread processing: The primary thread is a single thread processing process, which means it runs sequentially, one line at a time.(i.e psvm) Basically says that each should always contain psvm that is called single thread processing

Higher priority: The main thread has a higher priority than other threads created by the program. It implies that it receives first dibs on system resources like the CPU.

System-defined: When a Java program starts, the Java Virtual Machine (JVM) automatically runs the main thread. Basically the psvm runs automatically

Can create and initiate additional threads: The main thread controls and initiates any additional threads that the program may need. It is also in charge of organising how these lines will be executed.
 
How to create a thread in Java(multithreading)

There are two ways to create a thread:
By extending Thread class
By implementing Runnable interface.|
                   RAM(Primary Memory)
Run()[ ]    [  [sharing same resouces]  ]
Run()[ ]    [  [ th1   th2    th3    ]  ]The inside quare bracket is called thread pool. Thread pool is a memory or resouce where all the threads created in the program store/allocate in it
Run()[ ]    [  [                     ]  ]
1 run method is connect with the th1.2 run method is connect with the th2 and so on    
                    [cpu](Running state)

what is Thread pool? It is a area where all threads are allocated or placed

Thread Scheduler in Java
It is a part of a JVM which executed multiple threads on a single processor randomly.
         [processor] <--> [First come first severe scheduling , time slicing scheduling, primitive priority scheduling(round robin algorithum)]Thread scheduler<-->[ [thread-1 priority-7] [thread-2 priority-5] [thread-3 priority-5] [thread-4 priority-4] [thread-5 priority-2] ]Working of thread scheduler

         Working of the Java Thread Scheduler
Let's understand the working of the Java thread scheduler. Suppose, there are five threads that have different arrival times and different priorities. Now, it is the responsibility of the thread scheduler to decide which thread will get the CPU first.

The thread scheduler selects the thread that has the highest priority, and the thread begins the execution of the job. If a thread is already in runnable state and another thread (that has higher priority) reaches in the runnable state, then the current thread is pre-empted from the processor, and the arrived thread with higher priority gets the CPU time.

When two threads (Thread 2 and Thread 3) having the same priorities and arrival time, the scheduling will be decided on the basis of FCFS algorithm. Thus, the thread that arrives first gets the opportunity to execute first.


First Come First Serve Scheduling:
[ [t1] [t2] [t3] [t4] ]First come first serve schedule

Threads                time of arrival
t1                          0
t2                          1
t3                          2
t4                          3

burst time is given my os by default.

In this scheduling algorithm, the scheduler picks the threads thar arrive first in the runnable queue. Observe the following table:
In the above table, we can see that Thread t1 has arrived first, then Thread t2, then t3, and at last t4, and the order in which the threads will be processed is according to the time of arrival of threads.
Hence, Thread t1 will be processed first, and Thread t4 will be processed last.

Time-slicing scheduling:
Usually, the First Come First Serve algorithm is non-preemptive, 
which is bad as it may lead to infinite blocking (also known as starvation). 
To avoid that, some time-slices are provided to the threads so that after some time, the running thread has to give up the CPU.
Thus, the other waiting threads also get time to run their job.


^
|
|     [Thread 1] time quantum 
|     |        |
|     |        |
|     |        |
|     |        |    [Thread 2]   
|     |        |    |        |
|     |        |    |        |    
|     |        |    |        |                                             In the above diagram, each thread is given a time slice of 2 seconds. Thus, after 2 seconds, the first thread leaves the CPU, and the CPU is then captured by Thread2.The same process repeats for the other threads too.
|     |2 second|    |2second |    [Thread3]
|     |--------|    |--------|    |       |    
|     |        |    |        |    |       |    [Thread4]
|     |        |    |        |    |       |    |       |
|     |        |    |        |    |       |    |       |
|---------------------------------------------------------------->

Preemptive-Priority Scheduling:
The name of the scheduling algorithm denotes that the algorithm is related to the priority of the threads.

[Thread-1  ]    [Thread-2  ]
[Priority-6]    [Priority-2]
     ^
     |
     |
    [CPU]
----------------------------------------------------                      
[Thread-1  ]    [Thread-2  ]    [Thread-3  ]   
[Priority-6]    [Priority-2]    [Priority-7]         Suppose there are multiple threads available in the runnable state. The thread scheduler picks that thread that has the highest priority. Since the algorithm is also preemptive, therefore, time slices are also provided to the threads to avoid starvation. Thus, after some time, even if the highest priority thread has not completed its job, it has to release the CPU because of preemption.
                                    ^
                                    |
                                    |
                                  [CPU]
Preemptive-Priority Scheduling

Sleep(milisecond) : 
Static method
Throws an checked exception.
Purpose of using Is to put a thread into a temporary waiting state.

join(): When the join() method is invoked, the current thread stops its execution and the thread goes into the wait state. 
The current thread remains in the wait state until the thread on which the join() method is invoked has achieved its dead state. If interruption of the thread occurs, then it throws the InterruptExeption

Throws an checked exception.
Purpose of using Is to put a thread into a temporary waiting state.

The suspend() method of thread class puts the thread from running to waiting state. 
This method is used if you want to stop the thread execution and start it again when a certain event occurs. This method allows a thread to temporarily cease execution. The suspended thread can be resumed using the resume() method.

The resume() method of thread class is only used with suspend() method. 
This method is used to resume a thread which was suspended using suspend() method(suspend thread from waiting to running state). This method allows the suspended thread to start again.

A yield() method is a static method of Thread class and 
it can stop the currently executing thread and will give a chance to other waiting threads of the same priority.
Allow us to run another thread . Which has same priority by pause it’s current threads.

The stop() method of thread class terminates the thread execution. Once a thread is stopped, 
it cannot be restarted by start() method.
running state ---> dead state

The isAlive() method of thread class tests if the thread is alive.
 A thread is considered alive when the start() method of thread class has been called and the thread is not yet dead. This method returns true if the thread is still running and not finished.

 Is thread isAlive then it will return true otherwise false.
If we use isAlive() before the start then it will print false but after the start method it will print true.

The interrupt() method of thread class is used to interrupt the thread. 
If any thread is in sleeping or waiting state (i.e. sleep() or wait() is invoked) then using the interrupt() method, we can interrupt the thread execution by throwing InterruptedException.
If the thread is not in the sleeping or waiting state then calling the interrupt() method performs a normal behavior and doesn't interrupt the thread but sets the interrupt flag to true.

Priority of a Thread (Thread Priority)
Each thread has a priority. Priorities are represented by a number between 1 and 10. In most cases, 
the thread scheduler schedules the threads according to their priority (known as preemptive scheduling). 
But it is not guaranteed because it depends on JVM specification that which scheduling it chooses. 
Note that not only JVM a Java programmer can also assign the priorities of a thread explicitly in a Java program.
setPriority()
getPriority()
*/
//There are two ways to create a thread:
//1.By extending Thread class
class A extends Thread {// A is a thread class which impliment the multithreading.
  @Override // A is inheriting the thread class
  // run method is difined in runnable class. Runnable is an Interface
  public void run() // run() method is a override method. override method cannot throw an exception.
                    // inside the thread class
  {// run() is an abstract class. It is a main process/method.run() is a predefined
   // method inside Thread class
    // if we want to use thread class then we have to use run method inside the
    // Thread class
    try {
      for (int i = 1; i <= 3; i++) {// for {} is a sub process
        System.out.println("Child Thread jobs");
        // sleep method help to make an interruption in the program
        Thread.sleep(1000);// sleep() is a static method.to call static method we dont need to create an
                           // object it is related to class.It throws an InterruptedException
        // it makes the program waiting for 1 second
        /*
         * Exception in thread "main" Exception in thread "Thread-0" java.lang.Error:
         * Unresolved compilation problem:
         * Unhandled exception type InterruptedException
         * at A.run(MultiThreading1.java:353)
         */

        // 1000 milesecond is equal to 1 second
      }
    } catch (InterruptedException IException) {
      IException.printStackTrace();

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
}

public class MultiThreading1 {
  public static void main(String[] args) {// main method will call the JVM to terminate
    A T1 = new A();// creating the object of thread class
    A T2 = new A();// T1 AND T2 object of A class not(because A class extended Thread class tahts
                   // why we dont need to create any object for Thread class) Thread class sharing
                   // the same resouces i.e Thread class

    T1.start();// now the thread is start. start()is a predifined. start() is inside the Thread
               // class. This start() method is associated with the T1 object,T1 is the
               // reference.
    // T1.run(); // it does the same work as T1.start();. An actual thread is T1
    T2.start();
    // T2.run();//Ready state to Running state
    // t1 and t2 both executiong at the same time simultaniously
    // the start method makes the thread into runnable state(executable thread)and
    // also help to run the 'run()' method

    for (int i = 1; i <= 5; i++) {// for {} is a sub process
      System.out.println("Child Main Thread jobs");// cpu execute thread there is no sequence or order for the output

    }
  }

}
