// The Registration class

public class Registration {
	int id; // registration id
	String registration_time; // registration time
	String registration_date; // registration date
	int student_id; //student id
	int section_id; // section id
	
	// Constructor 
	public Registration(int id, String registration_time,
			String registration_date, int student_id, int section_id) {
		super();
		this.id = id;
		this.registration_time = registration_time;
		this.registration_date = registration_date;
		this.student_id = student_id;
		this.section_id = section_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegistration_time() {
		return registration_time;
	}

	public void setRegistration_time(String registration_time) {
		this.registration_time = registration_time;
	}

	public String getRegistration_date() {
		return registration_date;
	}

	public void setRegistration_date(String registration_date) {
		this.registration_date = registration_date;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public int getSection_id() {
		return section_id;
	}

	public void setSection_id(int section_id) {
		this.section_id = section_id;
	}

}
