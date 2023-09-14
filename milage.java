import java.util.*;
public class milage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split(" ");
        
        float min=999;
        String name="";
        for(int i=0;i<arr.length;i++){
            String[] arr1=arr[i].split("@");
            if(Float.parseFloat(arr1[1])<min){
                name=arr1[0];
                min=Float.parseFloat(arr1[1]);
            }
        }
        System.out.println(name);
    }
}

/*import java.util.*;
public class milage {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String[] wrds=s1.split(" ");
        float t=99999.999f;
        String s2=" ";
        for(int i=0;i<wrds.length;i++)
        {
        String[] nxt=wrds[i].split("\\@");
        if(Float.parseFloat(nxt[1])<t)
        {
            t=Float.parseFloat(nxt[1]);
            s2=nxt[0];
        }
        }
        System.out.println(s2);   
        }

}*/