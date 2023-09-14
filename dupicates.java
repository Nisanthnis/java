import java.util.*;
public class dupicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String after="";
        char arr[]=str.toCharArray();
        for(int i=0;i<str.length()-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println("");
            }
            else{
                after=after+Character.toString(arr[i]);
            }
        }
        System.out.print(after);
    }
}
