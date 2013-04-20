import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.HashMap;
import java.util.LinkedHashMap;


public class DBConnection {

	public static void main (String [] args) throws ParseException
	{
		// Specifies the database location
				// protocol:vendor://hostname:port/DB name
				String dbUrl = "jdbc:mysql://127.0.0.1:3306/classes_registration";
				String dbClass = "com.mysql.jdbc.Driver";
				// test query to retrieve all students 
				String query = "Select * FROM student";
				
				// Store the student information on hash able
				Map<String, Student> allStudent = new LinkedHashMap<String, Student>();
				Connection con = null;
				try {
					Class.forName(dbClass);
					con = DriverManager.getConnection(dbUrl, "root", "BLm7ItZI");
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(query);

					while (rs.next()) {
						Student s = new Student(rs);
						allStudent.put(s.getFirst_name(), s);
						System.out.println(s);
					} 
					}			
				catch (ClassNotFoundException e) {
					e.printStackTrace();
				}

				catch (SQLException e) {
					e.printStackTrace();
				}
	}
}
