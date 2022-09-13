import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2480 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		if (a != b && b != c && a != c) {
			// a,b,c 모두 다를 경우
			int max = Math.max(a, Math.max(b, c));
			System.out.println(max * 100);
		} else if (a == b && a == c) {
			// a,b,c 모두 같을 경우
			System.out.println(10000 + a * 1000);
		} else if (a == b || a == c) {
			// a가 b나 c랑만 같은 경우
			System.out.println(1000 + a * 100);
		} else {
			// b가 c랑 같을 경우
			System.out.println(1000 + b * 100);
		}

	}

}
