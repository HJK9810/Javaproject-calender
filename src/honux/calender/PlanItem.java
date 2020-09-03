package honux.calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class PlanItem {
	public Date planDate;
	public String detail;
	public String peoples ="";
	
	public static Date getDateformString(String strDate) {
		Date date = null;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public PlanItem(String date, String detail) {
		this.planDate = getDateformString(date);
		this.detail = detail;
	}
	
	public Date getDate() {
		return planDate;
	}
	
	public void addPeopls(String name) {
		peoples += name + ", ";
	}

	public String saveString() {
		return planDate.toString() + "," + detail + "\n";
	}
}
