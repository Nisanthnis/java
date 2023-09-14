import java.util.*;
public class RevTillUnderscore {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();  //abcd_pqrs
        String rev="";
        int ind=str.indexOf("_");
        // System.out.println(ind);
        if(ind==0){
            System.out.println(str);
        }else if(ind>0){
            String udescore=(str.substring(0,ind));
        // System.out.print(udescore);
        char arr[]=udescore.toCharArray();

        for(int i=arr.length-1;i>=0;i--){
            rev=rev+arr[i];
        }
        System.out.print(rev+str.substring(ind,str.length())); 
        }
        else{
        char arr[]=str.toCharArray();

        for(int i=arr.length-1;i>=0;i--){
            rev=rev+arr[i];
        }
        System.out.print(rev); 
        }
        
    }
}
