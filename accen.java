import java.util.*;
public class accen {
    public static void main(String[] args) {
        int arr[]={ 3, 2 ,1 ,7, 5, 4};
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
    for(int i=0;i<arr.length;i++){
        if(i%2==0){
            even.add(arr[i]);
        }else{
            odd.add(arr[i]);
        }
    }
    Collections.sort(odd);
    Collections.sort(even);
     System.out.println(odd.get(1)+even.get(1));
    }
}
