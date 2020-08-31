package honux.calender;
import java.util.*;

public class Prompt {
	
	/**
	 * 
	 * week 요일명
	 * return 0 ~ 6 ( 0 = Sunday, 6 = Saturday)
	 */
	public int parseDay(String week) {
		if (week.equals("su")) return 0;
		else if (week.equals("mo")) return 1;
		else if (week.equals("tu")) return 2;
		else if (week.equals("we")) return 3;
		else if (week.equals("th")) return 4;
		else if (week.equals("fr")) return 5;
		else if (week.equals("sa")) return 6;
		else 
			return 0;
	}

	public void runPropt() {
		Scanner scanner = new Scanner(System.in);
		Calender cal = new Calender();
		
		int month = 1;
		int year = 1;
		int weekday = 0;
		while(true) {
			System.out.println("년을 입력하세요.");
			System.out.print("Year > ");
			year = scanner.nextInt();
			System.out.println("달을 입력하세요.");
			System.out.print("Month > ");
			month = scanner.nextInt();
			System.out.println("첫쨰날의 요일을 입력하세요.(su, mo, tu, we, th, fr, sa)");
			System.out.print("Weekday > ");
			String str_weekday = scanner.next();
			weekday = parseDay(str_weekday);
			
			if(month == -1) {
				break;
			}
			
			if(month > 12) {
				continue;
			}
			
			cal.printCalender(year, month, weekday);
		}
		
		System.out.println("Have a nice day!");
		scanner.close();
	}

	
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPropt();
	}	
}


