import java.util.*;
public class OrderbyItsRank {
    public static void main(String[] args) {
        int array[]=new int[]{100,2,90,70,17};
        int newArray[]=Arrays.copyOfRange(array, 0, array.length);
        // for(int n:newArray)
        // System.out.println(n);
        Arrays.sort(newArray);// 2 17 70 90 100
        int k=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[i]==newArray[j]){
                   k=j+1;
                   System.out.println(k);
                }
            }
        }
    }
}
