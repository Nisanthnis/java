import java.util.*;
public class NumSum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int total=0;
        String str=Integer.toString(num);
       // System.out.println(str);
        for(int i=0;i<str.length();i++){
            total=total+Character.getNumericValue(str.charAt(i));
        }
       // System.out.println(total);
        if(total>9){
            int sums=0;
            String s=Integer.toString(total);
            for(int i=0;i<s.length();i++){
                sums=sums+Character.getNumericValue(s.charAt(i));
            }
            System.out.print(sums);
        }else{
            System.out.print(total);
        }
    }
}