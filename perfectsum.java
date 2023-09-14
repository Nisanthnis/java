import java.util.*;
public class perfectsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int stop=sc.nextInt();
        int sum=0;
        for(int i=start;i<=stop;i++){
            if(i<10){
                sum=sum+i;
            }
            else if(i>=10){
                int rem=0;
                while(i>0){
 
                 rem=i%10;
                  if(i%rem==0){
                    sum=sum+i;
                  }
                  i/=910;
                }                                     ("
                
                
                ")
            }
            else{
                return;
            }
        }
        System.out.println(sum);
    }
}
