
import java.sql.ResultSet;
import java.sql.SQLException;

// Student Class
public class Student {
	
	int id; // student id
	String first_name; // student first name
	String last_name; // student last name
	String e_mail; // student e-mail address
	int phone_no; // student phone number
	
	// Constructors
	public Student(ResultSet rs) throws SQLException
	{
		super();
		this.id = rs.getInt(1);
		this.first_name = rs.getString(2);
		this.last_name = rs.getString(3);
		this.e_mail = rs.getString(4);
		this.phone_no = rs.getInt(5);
		
	}
	public Student(int id, String first_name, String last_name, String e_mail,
			int phone_no) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.e_mail = e_mail;
		this.phone_no = phone_no;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public int getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", e_mail=" + e_mail
				+ ", phone_no=" + phone_no + "]";
	}
	
	
	

}
