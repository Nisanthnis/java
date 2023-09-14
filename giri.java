import java.util.*;
public class giri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int siz=sc.nextInt();
        int arr1[]=new int[]{1,2,3,4,6};
        int arr2[]=new int[]{1,2,3,4,6};
        int arr3[]=new int[]{1,2,3,4,12};
        int arr4[]=new int[]{2,4,6,8,13};

        int sum1=0,sum2=0,sum3=0;
        for(int i=0;i<arr4.length;i++){
            for(int j=0;j<arr4.length;j++){
            if(arr4[i]==arr1[j]){
                sum1=sum1+j;
            }
            if(arr4[i]==arr2[j]){
                sum2=sum2+j;
            }
             if(arr4[i]==arr3[j]){
                sum3=sum3+j;
            }
        }
    }
    System.out.println(sum1);
    System.out.println(sum2);
    System.out.println(sum3);
    System.out.println(sum1+sum2+sum3);

    }
}
