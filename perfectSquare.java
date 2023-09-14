import java.util.*;
public class perfectSquare{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[]{1,3,25,9,-5};
        for(int i=0;i<arr.length;i++){
            int s=(int)Math.sqrt(arr[i]);
            if(arr[i]==s*s){
                System.out.println(arr[i]+"");
            }
            else{
                continue;
            }
        }
        }
}