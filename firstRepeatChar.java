import java.util.*;
public class firstRepeatChar {
    public static int FirstRepeatingChar(int arr[],int num){
         for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++){
                if(arr[i]==arr[j]){
                    return i;
                }
            }
         }
         return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int index=FirstRepeatingChar(arr,num);
        if(index==-1){
            System.out.println("no repeat");
        }else{
            System.out.println(" repeat "+ arr[index]);
        }
    }
}
