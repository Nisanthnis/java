import java.util.*;
public class arrraylisttt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> string=new ArrayList<>();
        int num=sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();
        for(int i=0;i<str.length()-num+1;i++){
            string.add(str.substring(i,i+num));
            //System.out.print(string);
        }
        Collections.sort(string);
        System.out.println(string);
        

        }
}
