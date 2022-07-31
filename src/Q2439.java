import java.util.Scanner;

public class Q2439 {

	public static void main(String[] args) {
		// 별찍기(역)
		int n = 0;
		Scanner scanner = new Scanner(System.in);
		
		n = scanner.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - (i + 1); j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
