import java.util.*;
public class studentname {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String str;
        String name="";
        int maxmarks=0;
        String stdname="";
        for(int i=0;i<=num;i++){
            str=sc.nextLine();
            int mark=0;
            String arr[]=str.split(":");
            for(int j=0;j<arr.length;j++){
                if(j==0){
                    name=arr[j];
                }
                else{
                    mark=mark+Integer.parseInt(arr[j]);
                }
            }
            if(mark>maxmarks){
                maxmarks=mark;
                stdname=name;
        }
    }
    System.out.println(stdname);
}
}
