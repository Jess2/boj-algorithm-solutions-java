//자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

package level3;

import java.util.*; //Scanner를 사용하기 위해 import

public class level3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); //Scanner형 객체 생성
		
		System.out.println("100,000보다 작거나 같은 자연수를 입력하세요 : ");
		String input = scanner.nextLine(); //nextLine() 메서드를 호출해서 문자열 반환
		int num = Integer.parseInt(input); //입력받은 문자열을 숫자로 반환
		
		if(num>=1 && num<=100000) {
			for(int i=num; i>=1; i--) {
				System.out.println(i);
			}
		} else {
			System.out.println("100,000보다 작거나 같은 자연수를 입력하지 않았습니다. 프로그램 종료!");
		}

	}

}
