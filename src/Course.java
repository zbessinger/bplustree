// The Course Class
public class Course {

	int id; // course id
	String course_title; // course title;
	double credit_hour; // credit hours of the course
	int student_id; // student id
	
	// Constructor
	public Course(int id, String course_title, double credit_hour,
			int student_id) {
		super();
		this.id = id;
		this.course_title = course_title;
		this.credit_hour = credit_hour;
		this.student_id = student_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse_title() {
		return course_title;
	}
	public void setCourse_title(String course_title) {
		this.course_title = course_title;
	}
	public double getCredit_hour() {
		return credit_hour;
	}
	public void setCredit_hour(double credit_hour) {
		this.credit_hour = credit_hour;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	
	
}
