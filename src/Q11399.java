import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11399 {
	
	/**
	 * 
	 * 인출하는데 걸리는 시간을 오름차순으로 정렬하여
	 * 대기시간을 구해주는 활동 선택 문제
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		// 입력의 범위 1 ~ 1000
		int[] arr = new int[1001];

		// Counting Sort
		while (n > 0) {
			arr[Integer.parseInt(st.nextToken())]++;
			n -= 1;
		}

		int prev = 0; // 대기시간 누적합
		int sum = 0; // 사람별 대기시간 총합

		for (int i = 0; i < 1001; i++) {

			// 해당 i index가 0이 될 때까지 반복
			while (arr[i]-- > 0) {
				// 이전까지의 대기시간과 현재 사람이 걸리는 시간을 더해준다.
				sum += (i + prev);

				// 이전까지의 누적합에 현재 걸리는 시간을 더해준다.
				prev += i;
			}
		}

		System.out.println(sum);

	}

}
