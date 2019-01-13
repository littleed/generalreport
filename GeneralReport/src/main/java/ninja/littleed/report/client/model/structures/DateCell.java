package ninja.littleed.report.client.model.structures;

import java.util.Date;

public class DateCell implements Cell<Date> {

	private final Date date;
	
	DateCell(final Date date) {
		super();
		this.date = date;
	}

	@Override
	public Date getValue() {
		return date;
	}

}
