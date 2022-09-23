package DEMO;

public class StudentInfo {
	public String sname;
	public String sub;
	public String date;
	public String asscat;
	public int points;

	public StudentInfo(String sname, String sub, String asscat, String date, int points) {
		super();
		this.sname = sname;
		this.sub = sub;
		this.date = date;
		this.asscat = asscat;
		this.points = points;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAsscat() {
		return asscat;
	}

	public void setAsscat(String asscat) {
		this.asscat = asscat;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}
