//백준저지 알고리즘 7_4_1157
//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

package level7;

import java.util.Scanner;

public class level7_4_1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next(); //입력받은 단어를 str에 저장 
		str = str.toUpperCase(); //str을 대문자화 
		char[] charArr = str.toCharArray(); //str을 char형 배열로 변환하여 저장.
		
		int[] alphaArr = new int[26]; //알파벳 개수만큼의 크기를 가진 int형 배열 생성.
		int max = 0;
		int maxIndex = 0;
		
		for(int i=0; i<alphaArr.length; i++) { //알파벳 개수(26개)만큼 반복.
			for(int j=0; j<charArr.length; j++) { //입력받은 문자열의 길이만큼 반복.
				if(charArr[j] == (char)(i+65)) { //알파벳 위치 찾기. 
					alphaArr[i] += 1; //알파벳 배열에 해당 위치의 값 증가
				}
			}
		}
		
		//가장 많이 사용된 알파벳의 위치를 찾음 
		for(int i = 0; i < alphaArr.length; i++) {
			if(alphaArr[i] > max) {
				max = alphaArr[i];
				maxIndex = i+65;
			} else if(alphaArr[i] == max) {
				maxIndex = 63; //물음표 저장 
			}
		}
		
		System.out.println((char)(maxIndex));

	}

}
