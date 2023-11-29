

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
    String passengername;
    int busno;
    Date date;
    
    Booking(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        passengername=sc.next();
        System.out.println("Enter Bus no");
        busno=sc.nextInt();
        System.out.println("Enter Date format:dd-mm-yyyy");
        String inputdate=sc.next();
        SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=sf.parse(inputdate);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public boolean isAvailable() throws SQLException{
    	BusDAO busdao=new BusDAO();
         int capacity=busdao.getCapacity(busno);
         
         BookingDAO bookingdao=new BookingDAO();
         
         int booked=bookingdao.getBookinCount(busno,date);
          
         
         return booked<capacity?true:false;
    }
}