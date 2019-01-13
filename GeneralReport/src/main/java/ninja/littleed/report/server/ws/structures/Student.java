package ninja.littleed.report.server.ws.structures;

import java.util.Date;

public class Student {
	private String studentID;
	private String knownAs;
	private String surname;
	private Date dateOfBirth;
	private String yearStage;
	
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getKnownAs() {
		return knownAs;
	}
	public void setKnownAs(String knownAs) {
		this.knownAs = knownAs;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getYearStage() {
		return yearStage;
	}
	public void setYearStage(String yearStage) {
		this.yearStage = yearStage;
	}
	
}
