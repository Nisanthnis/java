import java.util.*;
public class misssingpalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char missing=' ';
        String str=sc.nextLine();//malayaam
        char arr[]=str.toCharArray();
        int i=0,j=0;
       for(i=0,j=arr.length-1;i<arr.length/2;i++,j--){
        if(arr[i]!=arr[j]){
            if(arr[i]==arr[j-1]&&(i!=j-1)){
            missing=arr[j];
            }
            else{
                missing=arr[i];
            }
        }
       }
       System.out.println(missing);
    }
}
