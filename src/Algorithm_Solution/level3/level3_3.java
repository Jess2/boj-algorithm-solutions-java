//N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.

package Algorithm_Solution.level3;

import java.util.*; //Scanner를 사용하기 위해 import

public class level3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); //Scanner 객체 생성
		
		System.out.println("구구단 몇 단을 실행해볼까요? ");
		String input = scanner.nextLine(); //nextLine() 메소드를 호출하여 문자열 반환
		int num = Integer.parseInt(input); //입력받은 문자열은 숫자로 반환
		
		for(int i=1; i<10; i++) {
			System.out.println(num + "*" + i + "=" + (num*i));
		}
		

	}

}
