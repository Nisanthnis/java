import java.util.*;
public class Linkedlist<T>{
    Node head;
    
    Linkedlist(){
        head=null;
    }

    public class Node{
        T data;
        Node next;
        
        Node(T val){
            data=val;
            next=null;
        }

    }
        
    public void insertAtbegining(T val){
         Node Newnode=new Node(val);
         if(head==null){
            head=Newnode;
         }
         else{
            Newnode.next=head;
            head=Newnode;
         }
    }

    public void display(){
          Node temp=head;
          while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
          }
    }
   
    public void insertAtPosition(int pos,T val){
        Node newNode =new Node(val);
         Node temp=head;
         if(pos==0){
            insertAtbegining(val);
         }
         if(temp==null){
            throw new IndexOutOfBoundsException("List is empty");
         }
         for(int i=0;i<pos-1;i++){
            if (temp.next == null) {
                throw new IndexOutOfBoundsException("Position out of bounds");
            }
            temp=temp.next;
         }
         newNode.next=temp.next;
         temp.next=newNode;
    }

    public void deleteAtPosition(int pos){
       Node temp=head;
       Node prev=null;
       if(temp==null){
        throw new IndexOutOfBoundsException("List is empty");
       }
       if(pos==0){
        head=head.next;
        return ;
       }
       for(int i=0;i<pos;i++){
        prev=temp;
        temp=temp.next;
       }
       prev.next=temp.next;
    }
 
    public void reverse(){
        Node prev=null;
        Node current=head;
        Node next=head.next;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        Linkedlist<Integer> list =new Linkedlist<Integer>();
        list.insertAtbegining(5);
        list.insertAtbegining(6);
        list.insertAtbegining(8);
        list.insertAtbegining(7);
        list.insertAtPosition(4,11);
        list.deleteAtPosition(0);
        list.display();
        list.reverse();
        System.out.print("\nReversed List: ");
        list.display();
    }
   
}
