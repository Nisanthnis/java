import java.util.*;
public class frequencyOfElementsinArray {
    public static void main(String[] args) {
        int arr[]=new int[]{10,20,30,10,20,20,50,70};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }else{
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
        ArrayList<Map.Entry<Integer,Integer>> entrylist=new ArrayList<>(hm.entrySet());
        Collections.sort(entrylist,(k,v)->v.getValue().compareTo(k.getValue()));
        System.out.println(entrylist);
        for(Map.Entry<Integer,Integer> entry:entrylist){
            int i=0;
            int storevalue=entry.getValue();
            while(i<storevalue){
                System.out.println(entry.getKey()+" ");
                i++;
            }
        }

            //System.out.println(entry.getKey()+" occurs "+entry.getValue()+" times");
        

    }
}
