import java.util.*;
public class Char1 {
    public static void main(String[] args) {
        int arr[]={10,11,123,333,431,522,198};
        for(int i=0;i<arr.length;i++){
            String str=Integer.toString(arr[i]);
                if(str.charAt(0)=='1'){
                    System.out.println(Integer.valueOf(str));
                }
        }
    }
}

