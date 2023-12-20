
import java.sql.*;
public class BusDAO { //data access object
	
	public void displayBusInfo() throws SQLException {
		String query="select * from bus";
		Connection con=DBconnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("Bus no: "+rs.getInt(1));
			if(rs.getInt(2)==0) {
			System.out.println("AC: no");
			}
			else {
   				System.out.println("AC: yes");
			}
			System.out.println("Bus Capacity: "+rs.getInt(3));
		}
	}
	
	public  int getCapacity(int id) throws SQLException{
		Connection con=DBconnection.getConnection();
		String query="select capcity from bus where bus_id= "+id;
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
		
	}

}
