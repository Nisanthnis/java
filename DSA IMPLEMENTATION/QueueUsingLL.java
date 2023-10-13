import java.util.*;

public class QueueUsingLL {
    Node front;
    Node rear;

    public class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    QueueUsingLL() {
        front = null;
        rear = null;
    }

    public void enqueue(int val) {
        Node newnode = new Node(val);
        if (front == null) {
            front = newnode;
            rear = newnode;
        } else {
            rear.next = newnode;
            rear = newnode;
        }
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }
        int removedValue = front.data;
        front = front.next;
        System.out.println("Dequeued element: " + removedValue);
    }

    public void display() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingLL queue = new QueueUsingLL();
        queue.enqueue(0);
        queue.enqueue(1);
        queue.enqueue(2);

        queue.display(); // Display the elements in the queue
        queue.dequeue(); // Dequeue an element
        queue.display(); // Display the updated queue
    }
}
