import java.util.*;
public class Symmetric {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=5,col=2;
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
       // System.out.println(arr[i][j]+" ");
       for(int i=0;i<row;i++){
        for(int j=i+1;j<row;j++){
            if(arr[i][0]==arr[j][1] && arr[i][1]==arr[j][0]){
                System.out.println("("+arr[i][0]+")"+","+"("+arr[i][1]);
            }
        }
       }
       sc.close();
    }
}
