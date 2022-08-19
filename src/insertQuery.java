import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertQuery {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://127.0.0.1:3306/coffee_store";
		String uname = "devuser";
		String password = "exiyxtmt97#";
		String insert = "INSERT INTO customers "
				+ "(first_name, last_name, gender, phone_number) "
				+ "VALUES ('Shourya','Sinha','M','01123147789')";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}	
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection(url, uname, password);
			Statement statement = con.createStatement();
			statement.execute(insert);
			statement.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
