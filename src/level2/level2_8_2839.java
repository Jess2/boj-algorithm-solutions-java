//백준저지 알고리즘 level2_8_2839

package level2;

import java.util.Scanner;

public class level2_8_2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int sugar = sc.nextInt();
		int numThree = 0;
		int numFive = sugar/5; //5kg짜리 봉투의 개수
		
		while(numFive >= 0) {
			if((sugar-(numFive*5))%3 != 0 && numFive != 0) { //5kg짜리 봉투로 들 수 있는만큼 다 들고난 후 남은 설탕을 3kg짜리 봉투로 들 수 없다면
				numFive--; //5kg짜리 봉투를 하나 줄임
			} else if ((sugar-(numFive*5))%3 == 0) { //5kg짜리 봉투로 들고 난 후 남은 설탕을 3kg짜리 봉투로 들 수 있다면
				numThree = (sugar-(numFive*5))/3;
				System.out.println(numFive + numThree);
				break;
			} else {
				System.out.println(-1);
				break;
			}
		}
		

	}

}
