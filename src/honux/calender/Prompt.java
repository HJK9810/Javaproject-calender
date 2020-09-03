package honux.calender;
import java.text.ParseException;
import java.util.*;

public class Prompt {
	
	public void printMenu() {
		System.out.println("+----------------------+");
		System.out.println("| 1. 일정 등록           ");
		System.out.println("| 2. 일정 검색           ");
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말 q. 종료");
		System.out.println("+----------------------+");
	}
	
	/**
	 * week 요일명
	 * return 0 ~ 6 ( 0 = Sunday, 6 = Saturday)
	 */
	public int parseDay(String week) {
		switch(week) {
		case "su":
			return 0;
		case "mo":
			return 1;
		case "tu":
			return 2;
		case "we":
			return 3;
		case "th":
			return 4;
		case "fr":
			return 5;
		case "sa":
			return 6;
		default:
			return 0;
		}
	}

	public void runPropt() throws ParseException {
		
		printMenu();
		
		Scanner scanner = new Scanner(System.in);
		Calender cal = new Calender();
		
	
		boolean isLoop = true;
		while(isLoop) {
			System.out.println("명령 (1, 2, 3, h, q)");
			String cmd = scanner.next();
			
			switch(cmd) {
			case "1":
				cmdRegistor(scanner,cal);
				break;
			case "2":
				cmdSearch(scanner,cal);
				break;
			case "3":
				cmdCal(scanner,cal);
				break;
			case "h":
				printMenu();
				break;
			case "q":
				isLoop = false;
				break;
			}
		}
		System.out.println("Have a nice day!");
		scanner.close();
	}

	
	private void cmdCal(Scanner s, Calender c) {

		int month = 1;
		int year = 1;	
		System.out.println("년을 입력하세요. (exit : -1)");
			System.out.print("Year > ");
			year = s.nextInt();

			System.out.println("달을 입력하세요.");
			System.out.print("Month > ");
			month = s.nextInt();
			if(month > 12 || month < 1) {
				System.out.println("잘못된 월을 입력하셨습니다.\n");
				return;
			}
						
			c.printCalender(year, month);
	}

	private void cmdSearch(Scanner s, Calender c) {
		System.out.println("[일정 검색]");
		System.out.println("날짜를 입력해 주세요 (yyyy-MM-dd).");
		String date = s.next();
		String plan = "";
		try {
			plan = c.serchPlan(date);
		} catch (ParseException e) {
			e.printStackTrace();
			System.err.println("일정 검색중 오류가 발생.");
		}
		System.out.println(plan);
	}

	private void cmdRegistor(Scanner s, Calender c) throws ParseException {
		System.out.println("[새 일정 등록]");
        System.out.println("날짜를 입력해 주세요 (yyyy-MM-dd).");
        String date = s.next();
        String text = "";
        s.nextLine(); //ignore one newline
        System.out.println("일정을 입력해 주세요.");
        text = s.nextLine();

        c.registerPlan(date, text);
	}

	public static void main(String[] args) throws ParseException {
		Prompt p = new Prompt();
		p.runPropt();
	}	
}


