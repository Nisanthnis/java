import java.util.*;
public class decreaseFrequency{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Character,Integer> hm=new HashMap<>();
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(!hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i),1);
            }else{
                hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
            }
        }
        ArrayList<Map.Entry<Character,Integer>> sortlist=new ArrayList<>(hm.entrySet());
        Collections.sort(sortlist,(a,b)->b.getValue().compareTo(a.getValue()));
        // System.out.println(hm);
        for(Map.Entry<Character,Integer> entry:sortlist){
            System.out.println(entry.getKey() + ": " + entry.getValue());//podu vera lvl
            
        }
    }
}