import java.util.*;
public class StackArray {
    static final int MAX_Size=30;
    int arr[]=new int[MAX_Size];
    int top;
    StackArray(){
        top=-1;
    }
    public void push(int val){
        if(top<MAX_Size-1){
            arr[++top]=val;
        }
    }

    public int pop(){
        if (top == -1) {
            throw new IndexOutOfBoundsException("List is empty");
            
        }
        return arr[top--];
    }

    public int peek(){
        return arr[top];
    }
    boolean isEmpty(){
        return top==-1;
    }
   public static void main(String[] args) {
    StackArray stack=new StackArray();
         stack.push(5);
         stack.push(6);
         stack.push(7);
         //stack.pop();
         while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
   } 
}
