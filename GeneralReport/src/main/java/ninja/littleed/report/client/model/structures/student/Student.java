package ninja.littleed.report.client.model.structures.student;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import ninja.littleed.report.client.model.structures.Cell;
import ninja.littleed.report.server.ws.structures.Field;

public class Student {

	private String id;
	private Map<Field, StringField> stringFields;
	
	public Student(String id) {
		this.id = id;
		cellMap = new HashMap<Field, Cell<?>>();
	}
	public String getId() {
		return id;
	}
	<T extends Cell>void setCell(Field field, T value) {
		cellMap.put(field, value);
	}
	public Cell<?> getCell(Field field) {
		Cell<?> c = cellMap.get(field);
	}
	
	public KnownAs getKnownAs() {
		return knownAs;
	}
	public Surname getSurname() {
		return surname;
	}
	public DoB getDateOfBirth() {
		return dateOfBirth;
	}
	public Stage getStage() {
		return stage;
	}
	
	public void setKnownAs(String knownAs) {
		this.knownAs = new KnownAs(knownAs);
	}
	public void setSurname(String surname) {
		this.surname = new Surname(surname);
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = new DoB(dateOfBirth);
	}
	public void setStage(String stage) {
		this.stage = new Stage(stage);
	}

}
