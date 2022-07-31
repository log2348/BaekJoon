import java.util.Scanner;

public class Q1065 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(arithmetic_sequence(scanner.nextInt()));
	}
	
	public static int arithmetic_sequence(int num) {
		int count = 0; // 한수 카운팅
		
		if(num < 100) {
			return num;
		}
		else {
			count = 99;
			if(num == 1000) {	// 예외처리
				num = 999;
			}
			
			for(int i = 100; i < num + 1; i++) {
				int hun = i / 100;	// 백의 자리
				int ten = (i % 100) / 10;	// 십의 자리
				int one = i % 10;	// 일의 자리
				
				if((hun - ten) == (ten - one)) { // 각 자릿수가 등차수열을 이루는지
					count++;
				}
			}
		}
		return count;
	}
	
}
