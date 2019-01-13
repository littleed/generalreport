package ninja.littleed.report.client.model;

import ninja.littleed.report.client.model.structures.Cell;
import ninja.littleed.report.client.model.structures.StringCell;
import ninja.littleed.report.server.ws.structures.Field;

public class FieldUtil {

	public static Class<? extends Cell<?>> getCellType(Field field) {
		return FieldDefinitions.getFieldDefinition(field).type;
	}

	private enum FieldDefinitions {
		KNOWN_AS(Field.KNOWN_AS, StringCell.class), 
		SURNAME(Field.SURNAME, StringCell.class);

		final Field field;
		final Class<? extends Cell<?>> type;

		private FieldDefinitions(Field field, Class<? extends Cell<?>> type) {
			this.field = field;
			this.type = type;
		}

		public static final FieldDefinitions getFieldDefinition(Field field) {
			for (FieldDefinitions definition : FieldDefinitions.values()) {
				if (definition.field.equals(field)) {
					return definition;
				}
			}
			throw new IllegalArgumentException("Unrecognised field exception" + field);
		}

	}

}
