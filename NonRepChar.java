import java.util.*;
public class NonRepChar{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ArrayList<Character> list=new ArrayList<>();

        for(int i=0;i<str.length();i++){
          if(!list.contains(str.charAt(i))){
            list.add(str.charAt(i));
          }
        }
        for(char s:list)
        System.out.print(s);
    }
}