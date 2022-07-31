import java.util.Scanner;

public class Q1330 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		//System.out.print("두 정수를 입력하세요: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		if(a > b) {
			System.out.println(">");
		}else if(a < b) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
	}

}
