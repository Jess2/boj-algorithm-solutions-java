//백준저지 알고리즘 - 9498
//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

package Algorithm_Solution.level4;

import java.util.*;

public class level4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("시험점수 입력(0~100) : ");
		String input = scanner.nextLine();
		int score = Integer.parseInt(input);

		if(score>=90) {
			System.out.println("A");
		} else if(score>=80) {
			System.out.println("B");
		} else if(score>=70) {
			System.out.println("C");
		} else if(score>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
