//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

package level3;

import java.util.*; //Scaner를 사용하기 위한 import

public class level3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); //Scanner 객체 생성
		
		while(true) {
			System.out.println("100보다 작거나 같은 자연수를 입력하세요 : ");
			String input = scanner.nextLine(); //nextLine() 메서드를 호출하여 문자열 반환
			int num = Integer.parseInt(input); //입력받은 문자열을 숫자로 반환
			
			if(num>=1 && num<=100) {
				for(int i=1; i<=num; i++) {
					for(int j=1; j<=i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			} else {
				System.out.println("100보다 작거나 같은 자연수를 입력하지 않았습니다.");
				continue;
			}
		}
	}

}
