/* 2.  Create  a  class  Queue  to  implement  queue  data  structure  with  constructors.  Define  suitable  
methods for insertion & deletion of elements to & from the queue. Write a program for this,  
clearly specifying the overflow & underflow conditions. */ 

package Queue;

import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the maximum size of the Queue: ");
        int maxSize = sc.nextInt();

        QueueClass queue1 = new QueueClass(maxSize); 

        boolean running = true;

        while (running) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Enqueue (Insert)");
            System.out.println("2. Dequeue (Delete)");
            System.out.println("3. Peek (Front Element)");
            System.out.println("4. Display Queue");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1-5): ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int val = sc.nextInt();
                    queue1.enqueue(val);
                    break;
                case 2:
                    queue1.dequeue();
                    break;
                case 3:
                    int peek1 = queue1.peek();
                    System.out.println("Front element is: " + peek1);
                    break;
                case 4:
                    queue1.display();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1-5.");
            }
        }

        sc.close();
        
    }

    // Node class should be static to be used in static context
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static class QueueClass {
        
        public Node head; // head is always pointing to the first element in the queue same as the front
        // it will always point to first element
        public Node tail; // tail is always pointing to the last element in the queue same as the rear it
        // will always point to last element
        
        int size; // Declare size as a member of QueueClass
        int maxSize; 

        public QueueClass(int maxSize) { // Constructor for QueueClass
            this.size = 0;
            this.maxSize = maxSize;
        }
        
        // Elements go in from the Rear (Tail) and come out from the Front (Head).
        public void enqueue(int data) {

            // OVERFLOW CONDITION
            if (size == maxSize) {
                System.out.println("Queue Overflow! Cannot insert " + data + ". Queue is full.");
                return;
            }

            // queue elements should be add at the tail "one after another"
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                // elements in queue are added at the tail
                // suppose [6900[69, 6700], 6700[67, 6800], 6800[68, null]] is the queue 69 was inserted first (it is at the front). 68 was inserted last (it is at the rear).
                // Enqueue 4200[420, nextAdd]
                // [6900[69, 6700], 6700[67, 6800], 6800[68, 4200], 4200[420, null]]
                tail.next = newNode;
                tail = newNode;
            }

            size = size + 1;

        }

        public int dequeue() {
            if (head == null) {
                System.out.println("Queue Underflow! Queue is empty, can't remove an element");
                return -1;
            } else {
                int local_front = head.data;

                // check if the list consists of one or more than one node
                if (head == tail) {
                    // it means that only one node exists on dll
                    head = null;
                    tail = null;
                } else {
                    head = head.next;//The data is still physically there, but logically ignored
                }

                size--;
                return local_front;
            }
        }

        public int peek() {
            if (head == null) {
                System.out.println("Queue is empty, can't peek an element");
                return -1;
            } else {
                int local_front = head.data;
                return local_front;
            }
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == maxSize;
        }

        public int size() {
            return size;
        }

        public void display() {
            if (head == null) {
                System.out.println("Queue is empty, nothing to be displayed");
            } else {
                Node temp = head;
                // A Linked List does not have indexes.
                while (temp != null) {
                    System.out.print(temp.data + " -> ");
                    temp = temp.next;
                }
                System.out.println("NULL");
            }
        }


    }

}

/*
Enter the maximum size of the Queue: 5

--- MENU ---
1. Enqueue (Insert)
2. Dequeue (Delete)
3. Peek (Front Element)
4. Display Queue
5. Exit
Enter choice (1-5): 1 
Enter value to enqueue: 67

--- MENU ---
1. Enqueue (Insert)
2. Dequeue (Delete)
3. Peek (Front Element)
4. Display Queue
5. Exit
Enter choice (1-5): 1
Enter value to enqueue: 68

--- MENU ---
1. Enqueue (Insert)
2. Dequeue (Delete)
3. Peek (Front Element)
4. Display Queue
5. Exit
Enter choice (1-5): 1
Enter value to enqueue: 69

--- MENU ---
1. Enqueue (Insert)
2. Dequeue (Delete)
3. Peek (Front Element)
4. Display Queue
5. Exit
Enter choice (1-5): 2

--- MENU ---
1. Enqueue (Insert)
2. Dequeue (Delete)
3. Peek (Front Element)
4. Display Queue
5. Exit
Enter choice (1-5): 3
Front element is: 68

--- MENU ---
1. Enqueue (Insert)
2. Dequeue (Delete)
3. Peek (Front Element)
4. Display Queue
5. Exit
Enter choice (1-5): 4
68 -> 69 -> NULL

--- MENU ---
1. Enqueue (Insert)
2. Dequeue (Delete)
3. Peek (Front Element)
4. Display Queue
5. Exit
Enter choice (1-5): 5
Exiting program...
*/