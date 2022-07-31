import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1152 {

	public static void main(String[] args) {
		String str = null;
		Scanner scanner = new Scanner(System.in);
		
		//System.out.print("문장을 입력하세요: ");
		str = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		System.out.println(st.countTokens());
	}

}
