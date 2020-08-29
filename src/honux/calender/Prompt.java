package honux.calender;
import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal > ";
	
	public void runPropt() {
		Scanner scanner = new Scanner(System.in);
		Calender cal = new Calender();
		
		int month = 1;
		while(true) {
			System.out.println("달을 입력하세요.");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			if(month == -1) {
				break;
			}
			
			if(month > 12) {
				continue;
			}
			
			cal.printCalender(2020, month);
		}
		
		System.out.println("Have a nice day!");
		scanner.close();
	}

	
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPropt();
	}	
}


