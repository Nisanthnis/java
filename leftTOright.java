import java.util.*;
public class leftTOright {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] =new int[]{10,20,30,40,50,60};
        int ind_from=sc.nextInt();
        ArrayList list=new ArrayList<>();
        ArrayList Balance=new ArrayList<>();
        for(int i=ind_from;i<arr.length;i++){
            list.add(arr[i]);
        }
        for(int i=0;i<ind_from;i++){
            Balance.add(arr[i]);
        }     
        //System.out.println(Balance);
        list.addAll(Balance);
        System.out.println(list);
    }
}
