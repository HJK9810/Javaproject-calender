package honux.calender;
import java.util.*;

public class Prompt {

	public void runPropt() {
		Scanner scanner = new Scanner(System.in);
		Calender cal = new Calender();
		
		int month = 1;
		int year = 1;
		while(true) {
			System.out.println("년을 입력하세요.");
			System.out.print("Year > ");
			year = scanner.nextInt();
			System.out.println("달을 입력하세요.");
			System.out.print("Month > ");
			month = scanner.nextInt();
			if(month == -1) {
				break;
			}
			
			if(month > 12) {
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


