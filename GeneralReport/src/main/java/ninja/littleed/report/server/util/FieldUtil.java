package ninja.littleed.report.server.util;

import java.util.ArrayList;
import java.util.List;

import ninja.littleed.report.server.ws.structures.Field;

public class FieldUtil {

	private static final String POSTFIX = ", ";
	private static final List<Field> studentFields = new ArrayList<Field>();
	static {
		studentFields.add(Field.KNOWN_AS);
		studentFields.add(Field.SURNAME);
		studentFields.add(Field.DoB);
		studentFields.add(Field.STAGE);
	}

	public void validateStudentFields(List<Field> studentFields) throws Exception {
		StringBuilder str = new StringBuilder();
		for (Field f : studentFields) {
			if (!studentFields.contains(f)) {
				str.append(f + POSTFIX);
			}
		}
		if (str.length() > 0) {
			str.setLength(str.length() - POSTFIX.length());
			throw new Exception("The following are not valid student fields: " + str.toString() + ".");
		}
	}
}
