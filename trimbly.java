import java.util.*;
public class trimbly {
    public static void main(String[] args) {
        Integer arr[]=new Integer[]{10,30,30,20,40,50};
        String str[]=new String[]{"Nisa","hello","hi","what","doing","now"};
        
        Integer newarr[]=Arrays.copyOfRange(arr,0,arr.length);
        Arrays.sort(newarr,Collections.reverseOrder()); // 50 40 30 30 20 10
        
        ArrayList<String> li=new ArrayList<>();
        ArrayList<String> Newli=new ArrayList<>();
        
        for(int i=arr.length-1;i>=0;i--){
            for(int j=arr.length-1;j>=0;j--){
            if(newarr[i]==arr[j]){
              li.add(str[j]);
            }
        }        
    }

    
    for(int i=li.size()-1;i>=0;i--){
        if(!Newli.contains(li.get(i))){
            Newli.add(li.get(i));
        }
    }
     for(String N:Newli){
     System.out.print(N+" ");
     }

     
}
}