import java.util.*;



public class LLpractise {
  Node head;
   LLpractise(){
        head=null;
    }
  public class Node{
    int data;
    Node next;

    Node(int val){
       data=val;
       next=null;
    }

}



 public void insertAtbegining(int val){
    Node newnode=new Node(val);
    if(head==null){
      head=newnode;
    }
    else{
        newnode.next=head;
        head=newnode;
    }
 }


 public void InsertAtPos(int pos,int val){
     Node newnode =new Node(val);
     Node temp=head;
     if(pos<0){
        throw new IndexOutOfBoundsException("Invalid pos");
     }
     if(pos==0){
        insertAtbegining(val);
     }
     for(int i=0;i<pos-1;i++){
        if(temp==null){
            throw new IndexOutOfBoundsException("Invalid pos");
        }
        temp=temp.next;
     }
     newnode.next=temp.next;
     temp.next=newnode;
 }


 public void insertAtEnd(int val){
    Node newnode=new Node(val);
    Node temp=head;
    if (head == null) {
      head = newnode;
  }
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=newnode;
 } 

  public void display(){
    Node temp=head;
    while(temp!=null){
        System.out.println(temp.data+" ");
        temp=temp.next;
    }
  }

  public void deleteAtpos(int pos){
    Node temp=head;
    Node prev=null;
    if(pos<0){
        throw new IndexOutOfBoundsException("Invalid pos");
     }
     if (pos==0) {
      head = head.next;
      return;
    }
    for(int i=0;i<pos;i++){
      if(temp==null){
            throw new IndexOutOfBoundsException("Invalid pos");
        }
       prev=temp;
       temp=temp.next;
    }
    if (temp != null) {
      prev.next = temp.next;
    
    
    } else {
      throw new IndexOutOfBoundsException("Invalid pos");
  }
  }
public static void main(String[] args) {
    LLpractise list=new LLpractise();
        list.insertAtbegining(5);
        list.insertAtbegining(6);
        list.insertAtbegining(8);
        list.insertAtbegining(7);
        list.InsertAtPos(4,11);
        list.deleteAtpos(0);
        list.display();
        // list.reverse();
        // System.out.print("\nReversed List: ");
        // list.display();
    
  }  
}
