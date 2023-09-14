import java.util.*;
public class RemoveVowl {
    public static void main(String[] args) {
        String str="nisanth";
        String After=str.replaceAll("[aeiou]", "");
        System.out.println(After);
    }
}
