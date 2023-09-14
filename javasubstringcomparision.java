import java.util.*;
public class javasubstringcomparision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();
        //System.out.println(s);
        
        for(int i=0;i<n;i++){
            String s=str.substring(i,i+1);
            System.out.println(s);
        }
    }
}
