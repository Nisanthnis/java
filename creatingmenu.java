import java.util.*;
public class creatingmenu {
    public static void main(String[] args) {
        ArrayList<Integer> integers=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while(true){
            mymenu();
            int choice=sc.nextInt();
            if(choice==1){
                System.out.println("enter the integer");
                integers.add(sc.nextInt());//[5, 6]
                System.out.println("added");
            }
            else if(choice==2){
                System.out.println("enter the element to remove");
                int elementToremove=sc.nextInt();
                if(integers.contains(elementToremove)){
                    integers.remove(Integer.valueOf(elementToremove));
                    System.out.println("removed");
                }
            }
            else if(choice==3){
                System.out.println("yourList:"+integers);
            }
            else if(choice==4){
                System.out.println("good bye");
                break;
            }
        }
        
    }
    public static void mymenu(){
        System.out.println();
        System.out.println("1.add");
        System.out.println("2.remove");
        System.out.println("3.display");
        System.out.println("4.exit");
        System.out.println();
        System.out.println("enter your choice");
    }
}
