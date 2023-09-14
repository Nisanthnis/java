import java.util.*;
public class VowOrCons{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        char s=Character.toLowerCase(ch);
        if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u'){
            System.out.println("Vowels");
        }else{
            System.out.println("not vowel");
        }
    }
}