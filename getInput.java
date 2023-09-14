import java.util.*;
public class getInput {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=num;i++){
            String n=sc.nextLine();
            str.add(n);
        }
        System.out.println(str);
        Collections.sort(str);
        System.out.println(str);
    }
}
