import java.util.*;
import java.lang.Math.*;
public class Minumdiatwords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();//the day is yours the so make it useful
        String word1=sc.nextLine();//the
        String word2=sc.nextLine();//yours
        int index1=-1,index2=-1,index3=-1,index4=-1,minlen1=0,minlen2=0,minlength=0;
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++){
            if(Objects.equals(arr[i], word1)){
                index1=i;
            }
            if(Objects.equals(arr[i], word2)){
                index2=i;
            }
        }
        //System.out.println(index1);
        //System.out.println(index2);
        for(int j=arr.length-1;j>=0;j--){
            if(Objects.equals(arr[j], word1)){
                index3=j;
            }
            if(Objects.equals(arr[j], word2)){
                index4=j;
            }
        }
        //System.out.println(index3);
        //System.out.println(index4);
         minlen1=Math.abs(index1-index2);
         minlen2=Math.abs(index3-index4);
        System.out.println(minlen1);
        System.out.println(minlen2);
         if(minlen1>=minlen2){
          minlength=minlen2;
         }
         else{
            minlength=minlen1;
         }
         System.out.println(minlength);
   }
 }
