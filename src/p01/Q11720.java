package p01;
import java.util.Scanner;

public class Q11720 {

	public static void main(String[] args) {
		int totalNum = 0;
		int result = 0;
		String numbers = null;
		Scanner scanner = new Scanner(System.in);
		
		//System.out.print("숫자의 개수: ");
		totalNum = scanner.nextInt();
		//System.out.print("숫자: ");
		numbers = scanner.next();
		
		int[] num = new int[totalNum];
		
		String[] str = numbers.split("");
		
		for(int i = 0; i < str.length; i++) {
			num[i] = Integer.parseInt(str[i]);
			result += num[i];
		}
		System.out.println(result);

	}

}
