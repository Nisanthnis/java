import java.util.*;
public class MinmalAbsDiff {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int arr[]=new int[]{2, 4, 5, 3};
        int result=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr.length;j++){
                sum=sum+Math.abs(arr[i]-arr[j]);
            }
            result=Math.min(sum,result);
        }
        System.out.println(result);
    }
}
