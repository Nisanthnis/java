import java.beans.IndexedPropertyDescriptor;
import java.util.*;


public class StackLinkedList {
    Node top;
    public class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }

    StackLinkedList(){
        top=null;
    }

    public void push(int val){
        Node newnode=new Node(val);
        newnode.next=top;
        top=newnode;
    }
    
    
    public int pop(){
          if(top==null){
            throw  new IndexOutOfBoundsException("Empty");
          }
          int temp=top.data;
          top=top.next;
          return temp;
    }

    public int peek(){
        return top.data;
    }

    public static void main(String[] args) {
        StackLinkedList stack=new StackLinkedList();

        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        
        while (stack.top != null) {
            System.out.println(stack.pop());
        }
    }
}
