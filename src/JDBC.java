import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://127.0.0.1:3306/coffee_store";
		String uname = "devuser";
		String password = "exiyxtmt97#";
		String query = "Select * from customers";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}	
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection(url, uname, password);
			Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery(query);
			
			while (result.next()) {
				String CustomerData = "";
				for (int i=1; i<6;i++) {
					CustomerData += result.getString(i) + "  ";
				}
				System.out.println(CustomerData);
			}
			statement.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}