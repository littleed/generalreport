package ninja.littleed.report.client.model;

import java.util.HashMap;
import java.util.Map;

import ninja.littleed.report.client.model.structures.student.Student;

class StudentReportModel {
	
	private final Map<String, Student> studentMap;

	public StudentReportModel() {
		studentMap = new HashMap<String, Student>();
	}
	
	
	public Student getStudent(String id) {
		return studentMap.get(id);
	}

}
