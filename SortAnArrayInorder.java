import java.util.*;
public class SortAnArrayInorder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]=new int[]{20, 1, 20, 5, 7, 1, 9, 39, 6, 18, 18 };
        int arr2[]=new int[]{20, 1, 18, 39};
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> Balancelist=new ArrayList<>();
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    list.add(arr1[j]);
                }
            }
        }
        for(int j=0;j<arr1.length;j++)
        if(!list.contains(arr1[j])){
            Balancelist.add(arr1[j]);
        }
         Collections.sort(Balancelist);
        //System.out.println(list);
       //System.out.println(Balancelist);
       list.addAll(Balancelist);
       System.out.println(list);
       sc.close();
    }
}
