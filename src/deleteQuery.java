import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class deleteQuery {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://127.0.0.1:3306/coffee_store";
		String uname = "devuser";
		String password = "exiyxtmt97#";
		String delete = "delete from customers where id = '25'";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}	
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection(url, uname, password);
			Statement statement = con.createStatement();
			statement.execute(delete);
			statement.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
