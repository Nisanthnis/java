
import java.sql.*;
import java.util.Date;
public class BookingDAO {
	public int getBookinCount(int busno,Date date) throws SQLException{
		String query="select count(passenger_name) from booking where bus_no=? and travel_date=?;";
		Connection con=DBconnection.getConnection();
		PreparedStatement pst=con.prepareStatement(query);
		java.sql.Date sqldate=new java.sql.Date(date.getTime());
		pst.setInt(1, busno);
		pst.setDate(2, sqldate);
		ResultSet rs=pst.executeQuery();
		rs.next();
		return rs.getInt(1);
	}
	
	public void addBooking(Booking booking) throws SQLException{
		String query="insert into booking values(?,?,?)";
		Connection con=DBconnection.getConnection();
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1,booking.passengername);
		pst.setInt(2, booking.busno);
		java.sql.Date sqldate=new java.sql.Date(booking.date.getTime());
		pst.setDate(3, sqldate);
		pst.executeUpdate();
  }

  public void cancelBooking(Booking booking) throws SQLException {
	String query = "DELETE FROM booking WHERE bus_no=? AND travel_date=? AND passenger_name=?";
	try (Connection con = DBconnection.getConnection();
		 PreparedStatement pst = con.prepareStatement(query)) {

		java.sql.Date sqldate = new java.sql.Date(booking.date.getTime());
		pst.setInt(1,booking.busno);
		pst.setDate(2, sqldate);
		pst.setString(3, booking.passengername);

		int rowsAffected = pst.executeUpdate();
		if (rowsAffected > 0) {
			System.out.println("Booking canceled successfully");
		} else {
			System.out.println("No booking found for the specified details. Please check your input.");
		}
	}
}
}
