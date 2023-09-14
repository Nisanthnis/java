import java.util.*;
public class spaceintSum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String arr[]=s.split(" ");
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int a=Integer.parseInt(arr[i]);
            //System.out.println(a);
            sum = sum+a;
        }
        System.out.print(sum);
    }
}