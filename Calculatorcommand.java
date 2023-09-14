import java.util.*;
import java.lang.Math;
import javax.lang.model.element.NestingKind;
public class Calculatorcommand {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        String str="5A11",var=""; //5A11
        char ch='a';
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(Character.isAlphabetic(ch)){
                var=Character.toString(ch);
                break;
            }
        }
            String[] s1=str.split(var);
            int ans=0;
                if(ch=='a'||ch=='A'){
                    ans=Integer.parseInt(s1[0])+Integer.parseInt(s1[1]);
                }
                else if(ch=='s'||ch=='S'){
                    ans=Integer.parseInt(s1[0])-Integer.parseInt(s1[1]);
                }
                else if(ch=='m'||ch=='M'){
                    ans=Integer.parseInt(s1[0])*Integer.parseInt(s1[1]);
                }
                else if(ch=='d'||ch=='D'){
                    ans=Integer.parseInt(s1[0])/Integer.parseInt(s1[1]);
                }

            System.out.println(Math.abs(ans));
        }

    }
