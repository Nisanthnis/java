import java.util.*;
public class longestPalindromeInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[]{5,7,10,161,340};
        Arrays.sort(arr);
        int temp=0;
        for(int i=arr.length-1;i>=0;i--){
            int arra[]=new int[1];
            int rev=0;
            arra[0]=arr[i];//999990
            temp=arra[0];
            while(temp>0){
                int num=temp%10;
                rev=rev*10+num;
                temp=temp/10;
            }
            if(rev==arra[0]){
                System.out.println(rev);
                break;
            }
        }
        sc.close();
    }
}
