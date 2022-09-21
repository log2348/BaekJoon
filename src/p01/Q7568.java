package p01;
import java.util.Scanner;

public class Q7568 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.print("전체 사람의 수: ");
		int n = scanner.nextInt();
		int rank = 0;
		
		int[][] arr = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			arr[i][0] = scanner.nextInt(); // 몸무게
			arr[i][1] = scanner.nextInt(); // 키
		}
		
		for(int i = 0; i < n; i++) {
			rank = 1;
			
			for(int j = 0; j < n; j++) {
				if(i == j) {
					continue;
				}
				else if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++;
				}
			}
			System.out.print(rank + " ");
		}
	}
}
