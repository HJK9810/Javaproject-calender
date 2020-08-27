package honux.calender;
import java.util.*;

public class Calender {
	
	private final int[] MAX_Days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMaxDaysOfMonth(int month) {
		return MAX_Days[month-1];
	}
	
	public void printSampleCalender() {
		System.out.println("Hello, Calender!");
		
		System.out.println("일   월  화     수    목   금   토");
		System.out.println("---------------------");
		System.out.println("1  2  3   4  5  6  7");
		System.out.println("8  9  10  11 12 13 14");
		System.out.println("15 16 17  18 19 20 21");
		System.out.println("22 23 24  25 26 27 28");
	}
	
	public static void main(String[] args) {
		
		String PROMPT = "cal > ";
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
			System.out.printf("%d월은 %d일 까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));
		}
		
		System.out.println("Have a nice day!");
		cal.printSampleCalender();
		scanner.close();
	}

}
