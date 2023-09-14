import java.util.*;
public class RemoveDuplicatElem {
    public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in);
    HashSet<Integer> hs=new HashSet<>();
    int arr[]=new int[]{10,20,30,10,20,40};
    for(int i=0;i<arr.length;i++){
        hs.add(arr[i]);
        System.out.println(hs);
    }
    sc.close();
    
   }
}
