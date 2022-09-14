import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q18108 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		int year = Integer.parseInt(input);
		
		System.out.println(year - 543);

	}

}
