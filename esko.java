import java.util.*;
public class esko {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int index=-1;
        for(int i=0;i<str.length();i++){
            if(!Character.isAlphabetic(str.charAt(i))){
                index=i;
                char special=str.charAt(i);
                System.out.println(special);
            }
        }
        String front=str.substring(0, index);
        String back=str.substring(index+1, str.length());
        String revfront="";
        String revback="";
        for(int i=front.length()-1;i>=0;i--){
            revfront=revfront+front.charAt(i);
        }
        for(int i=back.length()-1;i>=0;i--){
            revback=revback+back.charAt(i);
        }
        System.out.println(revfront);
        System.out.println(revback);
    }
}
