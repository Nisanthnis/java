import java.util.*;
public class merge {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a vallue");
    int a=sc.nextInt();
    System.out.println("enter b value");
    int b=sc.nextInt();
    int arr1[]=new int[a];
    int arr2[]=new int[b];
    for(int i=0;i<a;i++){
        arr1[i]=sc.nextInt();
    }

    for(int i=0;i<b;i++){
        arr2[i]=sc.nextInt();
    }
    int newarr[]=new int[arr1.length+arr2.length];
    for(int i=0;i<arr1.length;i++){
        newarr[i]=arr1[i];
    }
    for(int i=0;i<arr2.length;i++){
        newarr[arr1.length+i]=arr2[i];
    }
    for(int i=0;i<arr1.length+arr2.length;i++){
        System.out.print(newarr[i]+" ");
    }
   } 
}
