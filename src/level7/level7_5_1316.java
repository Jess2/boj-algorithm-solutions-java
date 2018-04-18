//BOJ level7_5_1316
//그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
//예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
//단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

//check please

package level7;

import java.util.Scanner;

public class level7_5_1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); //단어의 개수 입력받음
		
		char[][] charArr = new char[num][]; //2차원 배열 생성
		
		for(int i=0; i<num; i++) {
			String str = sc.next(); //위에서 입력받은 단어의 개수만큼 문자열 입력받음
			charArr[i] = new char[str.length()]; //입력받은 문자열의 길이만큼의 열 생성
			charArr[i] = str.toCharArray(); //입력받은 문자열을 char형 배열로 변환하여 2차원 배열에 넣음
		}
		
		for(int i=0; i<charArr.length; i++) { //행의 길이만큼 반복
			String str = ""; //str문자 초기화
			
			for(int j=0; j<charArr[i].length; j++) { //열의 길이만큼 반복
				if(str.contains(String.valueOf(charArr[i][j])) && charArr[i][j] != charArr[i][j-1]) {
					num--; //이미 앞에서 체크 완료된 문자이고, 바로 앞자리와 문자가 다를 때 -> 그룹 단어가 아니므로 개수 하나 줄임
					break; //해당 행의 단어는 그룹 단어가 아니므로 더 비교해볼 필요 없이 반복문을 종료하고 다음 행으로 넘어간다. 
				} else {
					str += String.valueOf(charArr[i][j]); //str에 문자 추가
				}
			}
		}
		
		System.out.println(num);
		sc.close();

	}

}
