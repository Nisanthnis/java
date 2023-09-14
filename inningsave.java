import java.util.*;
public class inningsave {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double inn1=0,inn2=0;
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            inn1=inn1+arr[i][0];
        }
            for(int j=0;j<2;j++){
                inn2=inn2+arr[j][1];
            }
        
        System.out.println(n);
        System.out.printf("%.2f",inn1/n);
        System.out.printf("%.2f",inn2/n);
        
    }
}
