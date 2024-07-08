import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host="localhost";

		String port= "3306";

		Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/testdb", "root", "password@123");
		Statement statement = con.createStatement();
		ResultSet rs = statement.executeQuery("select * from Employeedata where Age=22");
		while(rs.next()) { 
			System.out.println(rs.getString("Name"));
			System.out.println(rs.getString("Location"));
		}
	}

}
