//2
//There are two ways to create a thread:
//1.By implimentin running 
// multithreading starts from runnable Interface.Thread class impliment runnable Interface
// inside runnable class there is called run() method which is an abstract method which doesnt hava a body which has been override inside thread class
// i.e different than the previous run method
// Threads using Runnable Interface

class A implements Runnable{
@Override
    public void run() 
    {
        String name =Thread.currentThread().getName();// the current thread sechiduled by the cpu*
        for(int i=1;i<=3;i++){// thread will execute 3 times
            System.out.println("Thread:"+name);

        }

    }
}
public class MultiT  {
    public static void main(String[] args) {// main method will call the JVM to terminate
        //we are creating a reference of class A
        A R1 = new A();
        //    if we are implimenting multithreading with out the extends Thread class then we need to create object the for Thread class noT FOR THE extending class.
        
        /*    public Thread(R1) {
        this(group:null,target:null,"Thread"+nextThreadNum(),stactsize:0);
    } */ //1210
        Thread T1= new Thread(R1);// creating a thread by using Thread class but we didnt inhereted Thread class
// IT(T1) is a Thread reference. thread class addresss stored in it(the Thread reference)| new Thread() this is a instance part which is actually a constructor*/
        Thread T2= new Thread(R1);// now we have to take this thread into executable thread(running state)

        T1.setName("T1");
        T2.setName("T2 "+T2);//ITS CATCHING THE CURRENT EXECUTABLE THREAD NAME PRINTING IT THROUGH THE FOR LOOP

        T1.start();
      //  T2.run();//thread-->runnable state-->Now cpu will start execution|starting T2 as a separate thread.When you call T1.start(), it starts a new thread and executes the run method of A in that separate thread. However, when you call T2.run(), it doesn't start a new thread.instead, it directly calls the run method of A in the main thread without creating a new thread. 
       T2.start();
        //issue/problem- Racecondition--solotion-->Mutual exclusion--> at a time 1 process will enter in the critical section
        //suppose this method is a critical section here it is run method. when one thread is in the critical section then the other threads have to wait(consider threads as the processes) these thigs will not happen for this we have to achive synchronisation
       // for now all the threads entering in the critical section i.e run method at the same time.
       //output execution will be done simultaniously(the output sequence is complipetly depends on the Cpu)
      for (int i=1;i<=2;i++){// for {} is a sub process
        System.out.println("Child Main Thread jobs");//cpu execute thread there is no sequence or order for the output

        }
}}
