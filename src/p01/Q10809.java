package p01;
import java.util.Scanner;

public class Q10809 {

	public static void main(String[] args) {
		// 배열을 사용한 풀이		
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		//System.out.print("단어를 입력하세요: ");
		String word = scanner.next();
		
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			
			if(arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
