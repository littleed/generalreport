package ninja.littleed.report.server.businessif;

import java.util.List;

import ninja.littleed.report.client.model.structures.student.Student;
import ninja.littleed.report.server.ws.structures.StudentParam;

public interface GeneralReportIF {
	
	/**
	 * Get the student fields requested for the students in the year stages and currency requested.
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<Student> getStudents(StudentParam param) throws Exception;
	
}
