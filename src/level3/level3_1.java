//자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

package level3;

import java.util.Scanner; //Scanner을 사용하기 위해 import

public class level3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); //Scanner 객체 생성
		
		String input = scanner.nextLine(); //nextLine() 메서드를 호출해서 문자열 반환
		int num = Integer.parseInt(input); //입력받은 문자열을 숫자로 반환
		
		for(int i=1; i<=num; i++) {
			System.out.println(i);
		}
		
	}

}
