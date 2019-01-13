package ninja.littleed.report.client.model.structures;

public class StringCell implements Cell<String>{

	private final String value;

	StringCell(final String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return value;
	}
	

}
