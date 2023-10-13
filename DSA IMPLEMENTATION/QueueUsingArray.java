import java.util.*;
public class QueueUsingArray{
    final static int max_size=30;
    int arr[]=new int[max_size];
    int front,rear;
    QueueUsingArray(){
        front=-1;
        rear=-1;
    }

    public void enqueue(int val){
        if(front==-1){
            front++;
        }
        arr[++rear]=val;
    }
    public int dequeue1(){
       int temp=arr[0];
       for(int i=1;i<=rear;i++){
        arr[i-1]=arr[i];
       }
       rear--;
       return temp;
    }
    public int dequeue(){
        if(front==-1 || front>rear ){
            throw new IndexOutOfBoundsException("queue is empty");
        }
        return arr[front++];
    }
    public void printQueue() {
        if (front == -1) {
            System.out.println("Queue is empty.");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
      QueueUsingArray queue=new QueueUsingArray();
      queue.enqueue(5);
      queue.enqueue(7);
      queue.enqueue(8);
      queue.dequeue();
      queue.dequeue();
      queue.dequeue();
      

      queue.printQueue();



    }
    
}