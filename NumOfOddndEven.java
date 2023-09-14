import java.util.*;
public class NumOfOddndEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[]{10,20,21,22,33};
        int oddcount=0,evencount=0; //2 3
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evencount++;
            }else{
                oddcount++;
            }
        }
        System.out.println(evencount);
        System.out.println(oddcount);
        sc.close();
    }
}
