//BOJ level7_6_1152
//영어 대소문자와 띄어쓰기만으로 이루어진 문장이 주어진다. 이 문장에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.

package level7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class level7_6_1152 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start = 0; //단어의 시작 위치
		List<Object> oPerlishArray = new ArrayList<Object>(); //동적배열 생성
		
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine(); //문자을 입력받아서 String형 변수 str에 저장 
		
		for(int i=1; i<str.length(); i++) { //입력받은 문자열의 길이만큼 반복
			//공백 전까지의 단어를 add 하되, 공백 이전 문자가 공백이 아니어야 함
			if(str.charAt(i)==' ' && str.charAt(i-1)!=' ') {
				oPerlishArray.add(str.substring(start, i));
				start = i+1; //다음 단어의 시작위치 수정
			}
			
			//마지막 단어 add, 문자열의 마지막 문자가 공백이 아닐 경우.
			if(i==str.length()-1 && str.charAt(str.length()-1)!=' ') {
				oPerlishArray.add(str.substring(start, i+1));
			}
		}
		
		System.out.println(oPerlishArray.size());
		
		//System.out.println(arr.length);
//		for (int i = 0; i < oPerlishArray.size(); i++) {
//			System.out.format("[%d] = %s%n", i, oPerlishArray.get(i));
//		}
	}

}