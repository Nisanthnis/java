import java.util.*;
public class removeduplicates {
    public static void main(String[] args) {
        ArrayList<Integer> integers=new ArrayList<>();
        Scanner sc=new  Scanner(System.in);
        int input=sc.nextInt();
        for(int i=0;i<input;i++){
            int num=sc.nextInt();
            if(!integers.contains(num)){
                integers.add(num);
            }
        }
        System.out.println(integers);
        Collections.sort(integers);
    }
}
