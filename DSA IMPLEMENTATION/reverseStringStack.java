import java.util.*;
public class reverseStringStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        String str=sc.nextLine();
        Stack<Character> stack=new Stack<>();
        for(char c:str.toCharArray()){
            stack.push(c);
        } 
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
