import java.util.*;
public class ArraysDisjoint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]=new int[]{1,2,3,4,5,6};
        int arr2[]=new int[]{7,8,9};
        int flag=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            if(!hs.contains(arr1[i])){
                hs.add(arr1[i]);
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(hs.contains(arr2[i])){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Disjoint");
        }else{
            System.out.println("No");
        }
        sc.close();
        }
    }
