import java.util.*;
public class missing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr1[]=new int[num];
        int temp[]=new int[num];
        int duplicate=0;
        for(int i=0;i<num;i++){
             arr1[i]=sc.nextInt();
        }
        Arrays.sort(arr1);
        for(int j=0;j<arr1.length;j++){
        temp[j]=arr1[j];
        System.out.print(temp[j]);
        if(j+1<arr1.length){
        if(temp[j]==temp[j+1]){
            duplicate=arr1[j];
        }
    }
        else{

        }
    }
    System.out.println("duplicate is"+duplicate);
    }
}
