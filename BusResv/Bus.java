

import java.util.*;

public class
 Bus {
      private int busNo;
      private int capacity;
      private boolean ac;

      Bus(int num,int cap,boolean ac){
        this.busNo=num;
        this.capacity=cap;
        this.ac=ac;
      }
      
      public int getCapacity(){
        return capacity;
      }
      
       public int getBusNo(){
        return busNo;
      }
       public boolean isAc(){
        return ac;
      }
       public void setAC(boolean Ac){
        ac=Ac;
      }
      public void setCapacity(int cap){
        capacity=cap;
      }
     
}