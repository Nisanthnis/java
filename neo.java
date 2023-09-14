// You are using Java
import java.util.*;
public class neo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String para=sc.nextLine();
        String word=sc.nextLine();
        String[] str=para.split("[.]");
        int count=-1;
        int index=-1;
        int flag=-1;
        for(String x:str){
            count++;
            flag=x.indexOf(word);
            if(flag>=0){
                break;
            }
        }
        System.out.print(str[count]+" "+word);
    }
}