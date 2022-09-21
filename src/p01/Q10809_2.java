package p01;
import java.util.Scanner;
/*
 * indexOf()를 사용한 풀이
 * 
 * indexOf() - 해당 문자가 처음으로 등장하는 위치를 리턴
 * 			 - 만약 해당 문자가 문자열에 없으면 -1을 리턴한다.
 */
public class Q10809_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String word = scanner.next();
		for(char c = 'a'; c < 'z' + 1; c++) {
			System.out.print(word.indexOf(c) + " ");
		}

	}

}
