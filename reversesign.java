import java.util.*;
public class reversesign {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int number;
        if(num>0){
            number=num*-1;
            System.out.println(number);
        }
        else if(num<0){
            number=num*-1;
            System.out.println(number);
        }
        else{
            System.out.print(0);
        }
    }
}
