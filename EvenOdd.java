
    public class EvenOdd {
        public static void main(String[] args) {
          Thread evenThread = new Thread(() -> {
            for (int i = 100; i <= 200; i += 2) {
              System.out.println("even:"+i);
            }
          });
      
          Thread oddThread = new Thread(() -> {
            for (int i = 101; i <= 200; i += 2) {
              System.out.println("odd:"+i);
            }
          });
      
          evenThread.start();
          oddThread.start();
        }
      }
/*The arrow symbol -> is a lambda expression in Java.
 In the context of your provided code,
  the -> is used to define anonymous functions for the Runnable interface. */
