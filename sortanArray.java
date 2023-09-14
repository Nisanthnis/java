import java.util.*;
public class sortanArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[]{10,6,5,11};
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-1;j++){
               if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
               }
            }
        }
        for(int k:arr){
            System.out.println(k);
        }
        sc.close();
    }
}
