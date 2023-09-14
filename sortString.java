
import java.util.*;
import java.util.stream.Collectors;
public class sortString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2=sc.nextLine();

        String s1 = input1.chars()
        .sorted() 
        .mapToObj(c -> String.valueOf((char) c))
        .collect(Collectors.joining());
        
    
        String s2=input2.chars()
        .sorted()
        .mapToObj(a->String.valueOf((char)a))
        .collect(Collectors.joining());
        
        if(s1.equals(s2)){
         System.out.println("anagram");
        }else{
            System.out.println("not an anagram");
        }

        }
    }