import java.util.*;
public class nonRepeatingelements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[]{10,20,10,20,30,30,5,7};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }else{
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()==1){
              System.out.println(entry.getKey());
            }
        }
        sc.close();
    }
}
