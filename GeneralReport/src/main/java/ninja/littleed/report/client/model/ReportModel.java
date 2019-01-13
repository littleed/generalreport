package ninja.littleed.report.client.model;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import ninja.littleed.report.server.ws.structures.Field;

public class ReportModel {

	private final DefaultTableModel tableModel;
	private final List<ReportRow> rows;
	// Fields added
	private final LinkedHashSet<Field> fields;

	// Fields to be added
	private final LinkedHashSet<Field> newFields;

	public ReportModel() {
		tableModel = new DefaultTableModel();
		fields = new LinkedHashSet<Field>();
		newFields = new LinkedHashSet<Field>();
		rows = new ArrayList<ReportRow>();
	}

	public void addField(Field field) {
		if (fields.contains(field)) {
			throw new IllegalArgumentException("Field " + field + " has already been added to the report");
		} else if (newFields.contains(field)) {
			throw new IllegalArgumentException(
					"Field " + field + " has already been added to the list of fields to add to the report");
		}
		newFields.add(field);
	}

	/**
	 * Throws exception if nothing to be added.
	 */
	public void refreshReport() {

	}

	public TableModel getTableModel() {
		return tableModel;
	}

}
