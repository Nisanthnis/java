import java.util.*;
public class rath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ch="";
        char c=sc.next().charAt(0);
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==c){
                 break;
            }
            else{
                ch=ch+arr[i];
            }
        }
        System.out.println(ch);
    }
}
