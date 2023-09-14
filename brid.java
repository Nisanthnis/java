import java.util.Scanner;

public class brid {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int h=sc.nextInt();
    int l=sc.nextInt();
    int ib=0,ia=h;
    while(h!=0){
        if(ib*2+ia*4==l){
            System.out.print(ib+" "+ia);
            break;
        }
        ib++;
        ia--;
    }
    
}
}
