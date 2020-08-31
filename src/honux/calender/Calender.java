package honux.calender;
import java.util.*;

public class Calender {
	
	private final int[] MAX_Days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private final int[] LEAP_MAX_Days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
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
			return LEAP_MAX_Days[month-1];
		} else {
			return MAX_Days[month-1];
		}
	}
	
	public void printCalender(int year, int month, int weekday) {
		System.out.printf("    <<%4d년%3d월>>\n", year, month);
		System.out.println(" SU MO TU We TH FR SA");
		System.out.println("-----------------------");
		
		// print blank space
		for(int i = 0 ; i < weekday ; i++) {
			System.out.print("   ");
		}
		int maxDay = getMaxDaysOfMonth(year, month);
		int count = 7 - weekday;
		// print first line
		for(int i = 1; i<= count; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();

		// print second line ~ final line
		for(int i = count + 1; i <= maxDay ; i++) {
			System.out.printf("%3d", i);
			if(i % 7 == count) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();
	}
	
	public static void main(String[] args) {
		
	}
}
