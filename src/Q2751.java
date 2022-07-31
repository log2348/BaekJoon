import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q2751 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		//System.out.print("정렬할 수의 개수: ");
		int n = scanner.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			list.add(scanner.nextInt());
		}
		
		Collections.sort(list);
		
		for(Integer value : list) {
			sb.append(value).append("\n");
		}
		
		System.out.println(sb);

	}

}
