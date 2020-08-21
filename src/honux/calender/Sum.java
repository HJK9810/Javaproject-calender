package honux.calender;
import java.util.*;

public class Sum {

	public static void main(String[] args) {
		int a, b;
		Scanner scanner = new Scanner(System.in);
		String a1, b1;
		System.out.println("두 수를 입력하세요.");
		a1 = scanner.next();
		b1 = scanner.next();
		a = Integer.parseInt(a1);
		b = Integer.parseInt(b1);
		System.out.println("두 수의 합은 " + (a + b) + "입니다.");
	}

}
