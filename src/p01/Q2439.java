package p01;
import java.util.Scanner;

public class Q2439 {

	public static void main(String[] args) {
		// 별찍기(역)
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < n - (i + 1); j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - (i + 1); j++) {
				System.out.print("*");
			}
			for(int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		scanner.close();

	}

}
