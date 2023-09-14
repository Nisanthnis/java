import java.util.*;
public class CaptalizeFirstndLast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++){
            String s=arr[i];
            String finall="";
            for(int j=0;j<s.length();j++){
                if(j==0 || j==s.length()-1){
                    finall=finall+s.toUpperCase().charAt(j);
                }else{
                    finall=finall+s.charAt(j);
                }
            }
            System.out.print(finall+" ");
        }
    }
}
