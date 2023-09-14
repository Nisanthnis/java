import java.util.*;
public class MaxSubarrayProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[]{2,3,-2,3};
        int prefix=1,suffix=1;
        int maxvalue=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(prefix==0){
                prefix=1;
            }
            if(suffix==0){
                suffix=1;
            }
             prefix=prefix*arr[i];
             suffix=suffix*arr[arr.length-i-1];
             maxvalue=Math.max(maxvalue, Math.max(prefix,suffix));
        }
        System.out.println(maxvalue);
        sc.close();
    }
}
