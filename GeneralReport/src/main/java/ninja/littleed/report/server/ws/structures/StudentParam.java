package ninja.littleed.report.server.ws.structures;

import java.util.List;

public class StudentParam {

	private List<Field> studentFields;
	private List<String> yearStages; //Their year stages
	public List<Field> getStudentFields() {
		return studentFields;
	}
	public List<String> getYearStages() {
		return yearStages;
	}

}
