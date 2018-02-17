//백준저지 알고리즘 level6_2_2577

package level6;

import java.util.Scanner;

public class level6_2_2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int num = 1;
		
		//반복문을 돌며 세 개의 수를 입력받아서 num에 곱해가며 저장
		for(int i=0; i<3; i++) {
			num *= scanner.nextInt();
		}
		
		String numStr = String.valueOf(num); //int형 변수 num을 String형으로 형변환하여 변수 numStr에 저장 
		char[] charArr = numStr.toCharArray(); //String형 변수 numStr을 char형 배열로 변환. 배열 이름은 charArr 
		int[] resultArr = new int[10]; //결과값을 저장할 int형 배열 resultArr 생성 
		
		for(int i=0; i<resultArr.length; i++) { //결과 값을 저장할 배열의 길이만큼 반복 (10번 반복)
			for(int j=0; j<charArr.length; j++) { //입력받은 수들을 곱한 값의 길이만큼 반복 
				if(charArr[j] == Character.forDigit(i, 10)) { //숫자 i를 char형으로 바꾼 것과 입력받은 수들을 곱한 값의 j번째 숫자와 같을 경우
					resultArr[i] += 1;
				}
			}
			
		}
		
		for(int i=0; i<resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}

	}

}