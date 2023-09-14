import java.util.*;
public class Patter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row =sc.nextInt();
        int arr[][]=new int[row][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
}