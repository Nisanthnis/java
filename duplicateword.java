import java.util.*;
public class duplicateword {
    public static void main(String[] args) {
        ArrayList<String> string=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<num;i++){
            String str=sc.nextLine();
            String arr[]=str.split(" ");
            for(int j=0;j<arr.length;j++)
            if(!string.contains(arr[j])){
                string.add(arr[j]);
            }

        }
        System.out.print(string);
    }
}
