//백준저지 알고리즘 6_3_8958

package level6;

import java.util.*;

public class level6_3_8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("테스트 케이스 개수 입력 : ");
		int caseNum = scanner.nextInt();
		int count = 0;
		
		int[] resultArr = new int[caseNum];
		
		for(int i=0; i<caseNum; i++) {
			System.out.print((i+1)+"번째 테스트 케이스 입력 : ");
			
			Scanner scanner2 = new Scanner(System.in);
			String input = scanner2.nextLine();
			char[] charArr = input.toCharArray(); //string을 char배열로 변환
			
			for(int j=0; j<charArr.length; j++) { //charArr 길이만큼 반복 
				if(charArr[j]=='O') { //O일 경우 
					resultArr[i] += (count + 1);
					count ++;
				} else if(charArr[j]=='X') { //X일 경우 count 초기
					count = 0;
				}
			}
			count = 0; //테스트케이스가 한 번 끝날 경우 count 초기
		}
		
		for(int i=0; i<caseNum; i++) {
			System.out.println(resultArr[i]);
		}

	}

}
