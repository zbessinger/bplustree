//The Section class

public class Section {
	int id; // section id
	String time_start; // start time of the section
	String time_end; // end time of the section
	String location; // the location of the section
	String days; // days of teaching the section
	int year; // section year
	String term; // section term
	int course_id; // the course id
	int instructor_id; // instructor id
	
	// Constructor
	public Section(int id, String time_start, String time_end, String location,
			String days, int year, String term, int course_id, int instructor_id) {
		super();
		this.id = id;
		this.time_start = time_start;
		this.time_end = time_end;
		this.location = location;
		this.days = days;
		this.year = year;
		this.term = term;
		this.course_id = course_id;
		this.instructor_id = instructor_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTime_start() {
		return time_start;
	}

	public void setTime_start(String time_start) {
		this.time_start = time_start;
	}

	public String getTime_end() {
		return time_end;
	}

	public void setTime_end(String time_end) {
		this.time_end = time_end;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public int getInstructor_id() {
		return instructor_id;
	}

	public void setInstructor_id(int instructor_id) {
		this.instructor_id = instructor_id;
	}
	
	
	
	

}
