import java.util.*;
public class Freq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(!hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i),1);
            }else{
                hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
            }
        }
        ArrayList<Map.Entry<Character,Integer>> arrname=new ArrayList<>(hm.entrySet());
        Collections.sort(arrname,(k,v)->v.getValue().compareTo(k.getValue()));
        for(Map.Entry<Character,Integer> entry:arrname){
           System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }

}
