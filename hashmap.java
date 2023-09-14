import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Character,Integer> arr=new HashMap<Character,Integer>();
        String str="GoodMorning";
        for(int i=0;i<str.length();i++){
            if(arr.get(str.charAt(i))!=null){
                arr.put(str.charAt(i),arr.get(str.charAt(i))+1);
            }
            else{
            arr.put(str.charAt(i),1);
            }
        }
        System.out.print(arr);
    }
}
