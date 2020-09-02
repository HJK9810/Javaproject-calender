package honux.calender;

public class Calender {
	
	private final int[] MAX_Days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private final int[] LEAP_MAX_Days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public boolean isLeapYear(int year){
		if(year % 4 == 0 && (year % 100 != 0) || (year % 400 == 0)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_Days[month];
		} else {
			return MAX_Days[month];
		}
	}
	
	public void printCalender(int year, int month) {
		System.out.printf("    <<%4d년%3d월>>\n", year, month);
		System.out.println(" SU MO TU We TH FR SA");
		System.out.println("-----------------------");
		
		//get weekday automatically
		int weekday = getWeekDay(year, month, 1);
		
		// print blank space
		for(int i = 0 ; i < weekday ; i++) {
			System.out.print("   ");
		}
		int maxDay = getMaxDaysOfMonth(year, month);
		int count = 7 - weekday;
		int delim = count < 7 ? count : 0;
				
		// print first line
		for(int i = 1; i<= count; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		count++;

		// print second line ~ final line
		for(int i = count; i <= maxDay ; i++) {
			System.out.printf("%3d", i);
			if(i % 7 == delim) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();
	}
	
	private int getWeekDay(int year, int month, int day) {
		int syear = 1970;
		final int STANDARD_WEEKDAY = 4; // 1970.01.01 = Thursday
		
		int count = 0;
		
		for(int i = syear; i < year ; i++) {
			int delta = isLeapYear(i) ? 366 : 365;
			count += delta;
		}
		
		for(int i = 1 ; i < month ; i++) {
			int delta = getMaxDaysOfMonth(year, i);
			count += delta;
		}
		count += day - 1;
		
		int weekday = (count + STANDARD_WEEKDAY) % 7;
		return weekday;
	}

	public static void main(String[] args) {
		
	}
}
