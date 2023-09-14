import java.util.*;
public class CountDistinctElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[]{10, 40, 50, 20, 10, 20, 30, 10};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }else{
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
        int count=0;
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()>1){
                count=count+entry.getValue();
            }
        }
        System.out.println(count);
        sc.close();
    }
}
