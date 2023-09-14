import java.util.*;
public class AplhaOrNor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("alph");
        }else{
            System.out.println("not alph");
        }
    }
}
