import java.util.*;
public class Equilibriumpooint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[]{2,3,4,1,5,1,2,3,4};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        int index=0;
        int leftsum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum-arr[i];
            if(leftsum==sum){
                 index=i;
            }
            leftsum=leftsum+arr[i];
        }
        System.out.println(index);
    }
}
