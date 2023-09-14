import java.util.*;
public class MinimumScallerofProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]=new int[]{10,30,20,40};
        Integer arr2[]=new Integer[]{2,4,5,1};
        Arrays.sort(arr1);
        Arrays.sort(arr2,Collections.reverseOrder());
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            sum=sum+(arr1[i]*arr2[i]);
        }
        System.out.println(sum);
        sc.close();
    }
}
