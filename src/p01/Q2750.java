package p01;
import java.util.Arrays;
import java.util.Scanner;

public class Q2750 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// System.out.print("정렬할 숫자의 개수: ");
		int n = scanner.nextInt();
		
		int[] numArray = new int[n];
		
		for(int i = 0; i < n; i++) {
			numArray[i] = scanner.nextInt();
		}
		
		Arrays.sort(numArray);
		
		for(int i = 0; i < n; i++) {
			System.out.println(numArray[i]);
		}

	}

}
