0.
import java.util.*;
public class Expandalphabet {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            String s="";
            int index=-1;
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(Character.isDigit(ch)){
                    int a=ch-'0';
                    index=i;
                    if(i<str.length()-1){
                        
                        if(Character.isDigit(str.charAt(i+1))){
                            a=a*10+(str.charAt(i+1)-'0');
                            index=i+1;
                        }
                    }
                    for(int j=0;j<a-1;j++){
                        s+=str.charAt(index+1);
                    }
            }
                else{
                    s+=ch;
                }
            }
            System.out.println(s);
        
    }
}
