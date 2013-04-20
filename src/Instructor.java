// The Instructor class
public class Instructor {
	
	int id; // instructor id
	String first_name; // instructor first name
	String last_name; // instructor last name
	String e_mail; // instructor e-mail address
	int phone_no; // instructor phone number
	
	// Constructor
	public Instructor(int id, String first_name, String last_name,
			String e_mail, int phone_no) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.e_mail = e_mail;
		this.phone_no = phone_no;
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
	
}
