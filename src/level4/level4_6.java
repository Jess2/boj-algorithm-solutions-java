//백준저지 알고리즘 1110

package level4;

import java.util.Scanner;

public class level4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cycle = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt(); //사용자로부터 숫자를 입력받음
		final int origin = num; //입력받은 숫자를 기억하는 상수 선언
		
		do {
			sum = (num/10) + (num%10); //1의 자리 수와 10의 자리 수의 값을 더해서 sum에 저장
			num = ((num%10)*10) + (sum%10); //입력받은 값의 1의 자리 수를 10의 자리수로 만든 것과 위에서 만든 sum의 1의 자리수를 더하여 새로운 num을 만든다.
			cycle++; //cycle 추가
		} while(num!=origin); //새롭게 만든 num이 원래의 num값인 origin과 다르면 다시 반복, 같아질 경우 반복문 탈출 후 아래에서 cycle 출력
		
		System.out.println(cycle);

	}

}

