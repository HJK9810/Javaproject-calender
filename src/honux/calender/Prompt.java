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
		while(true) {
			System.out.println("년을 입력하세요. (exit : -1)");
			System.out.print("Year > ");
			year = scanner.nextInt();
			if(year == -1)
				break;
			
			System.out.println("달을 입력하세요.");
			System.out.print("Month > ");
			month = scanner.nextInt();
			if(month > 12 || month < 1) {
				System.out.println("잘못된 월을 입력하셨습니다.\n");
				continue;
			}
						
			cal.printCalender(year, month);
		}
		
		System.out.println("Have a nice day!");
		scanner.close();
	}

	
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPropt();
	}	
}


