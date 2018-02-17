//백준저지 알고리즘 6_3_8958

package level6;

import java.util.Scanner;

public class level6_3_8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int caseNum = scanner.nextInt(); //테스트케이스 개수 입력받아 저장
		int count = 0;
		
		int[] resultArr = new int[caseNum]; //테스트케이스 길이만큼 결과값을 저장할 배열 생성
		
		scanner.nextLine();
		for(int i=0; i<caseNum; i++) { //테스트케이스 개수만큼 반복
			String input = scanner.next();
			char[] charArr = input.toCharArray(); //입력받은 string을 char배열로 변환
			
			for(int j=0; j<charArr.length; j++) { //charArr 길이만큼 반복 
				if(charArr[j]=='O') { //O일 경우 
					resultArr[i] += (count + 1);
					count ++;
				} else if(charArr[j]=='X') { //X일 경우 count 초기화 
					count = 0;
				}
			}
			count = 0; //테스트케이스가 한 번 끝날 경우 count 초기화 
		}
		
		for(int i=0; i<caseNum; i++) {
			System.out.println(resultArr[i]); //결과값을 저장한 배열의 값을 하나씩 출력
		}

	}

}
