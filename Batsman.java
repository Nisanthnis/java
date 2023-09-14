import java.util.*;
import java.util.Scanner;
import javax.swing.plaf.synth.SynthToolTipUI;
public class Batsman {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str,batsman="";
        int num=sc.nextInt();
        String name="";
        for(int i=0;i<=num;i++){
            str=sc.nextLine();
            int run=0,max=0;
            String arr[]=str.split(",");
            for(int j=0;j<arr.length;j++){
                if(j==0){
                    name=arr[j];
                }
                else{
                    run=Integer.parseInt(arr[j]);


                    
                }
                if(run>max){
                    max=run;
                    batsman=name;
                }
            }
        }
        System.out.println(batsman);

    }
}
