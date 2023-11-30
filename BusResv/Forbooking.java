


import java.sql.SQLException;
import java.util.*;
public class Forbooking {

    public static void main(String[] args) throws SQLException {
        Scanner sc=new Scanner(System.in);

        BusDAO busdao=new BusDAO();
        System.out.println("Bus Info:");
        try {
			busdao.displayBusInfo();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        

        String fromuser="yes";
        while(fromuser.equals("yes")){
            
            System.out.println("Enter YES to Book and NO to exit");
            fromuser=sc.nextLine().toLowerCase();

            if(fromuser.equals("yes")){
              Booking booking=new Booking();
              if(booking.isAvailable()){
            	  BookingDAO bookingdao=new BookingDAO();
            	  bookingdao.addBooking(booking);
                  System.out.println("Your booking is confirmed");
              }
              else{
                System.out.println("Bus capacity is full try another Date");
              }
            }
            else{
                System.out.println("Thanks for visiting");
            }
        }
    }
    
}
