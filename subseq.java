import java.util.*;
public class subseq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int index=-1;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            for(int j=0;j<str1.length();j++){
                if(list.contains(j)) {
                    continue;
                }
                  if(ch==str1.charAt(j)){
                    if(index < j) {
                        index = j;
                        list.add(j);
                    } else {
                        System.out.println("Non seq");
                        return;
                    }
                  }
            }
        }
        System.out.println("seq");
     }
}

