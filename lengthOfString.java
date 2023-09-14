import java.util.*;
public class lengthOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char chararr[]=str.toCharArray();
        int count =0;
        for(char i:chararr){
            count++;
        }
        System.out.println(count);
    }
}
