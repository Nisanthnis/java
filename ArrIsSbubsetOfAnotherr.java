import java.util.*;
public class ArrIsSbubsetOfAnotherr {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr1[]=new int []{1,2,3,4,5,6};
    int arr2[]=new int []{5,6,9};
    ArrayList<Integer> list=new ArrayList<>();
    int flag=0;
    for(int i=0;i<arr1.length;i++){
        list.add(arr1[i]);
    }
    for(int i=0;i<arr2.length;i++){
        if(!list.contains(arr2[i])){
            flag=1;
        }
    }
    if(flag==0){
        System.out.println("Its a subset");
    }else{
        System.out.println("not a subset");
    }
    sc.close();
 }   
}
