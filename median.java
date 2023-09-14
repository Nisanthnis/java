import java.util.*;
public class median {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]={1,3};
        int arr2[]={2};
        int con=arr1.length+arr2.length;
        int arr[]=new int[con];
        int count=0;
        for(int i=0;i<arr1.length;i++){
            arr[i]=arr1[i];
            count++;
        }
        for(int i=0;i<arr2.length;i++){
        arr[count]=arr2[i];
        count++;
        }
        Arrays.sort(arr);
        for(int i:arr){
        System.out.println(i);
        }
        if(arr.length%2==0){
        int mid=arr.length/2;//2
        System.out.println((double)(arr[mid]+arr[mid-1])/2);
        }
        else{
            int mid=arr.length/2;//2
        System.out.println((double)(arr[mid]));
        }
    }

}
