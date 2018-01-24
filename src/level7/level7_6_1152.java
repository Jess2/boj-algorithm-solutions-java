//BOJ level7_6_1152
//영어 대소문자와 띄어쓰기만으로 이루어진 문장이 주어진다. 이 문장에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.

package level7;

import java.util.*;

public class level7_6_1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start = 0; //단어의 시작 위치
		List<Object> oPerlishArray = new ArrayList<Object>(); //동적배열 생성
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문장 입력 : ");
		String input = scanner.nextLine();
		
		for(int i=1; i<input.length(); i++) {
			//공백 전까지의 단어 add
			if(input.charAt(i)==' ' && input.charAt(i-1)!=' ') {
				oPerlishArray.add(input.substring(start, i));
				start = i+1; //다음 단어의 시작위치 수정
			}
			
			//마지막 단어 add
			if(i==input.length()-1 && input.charAt(input.length()-1)!=' ') {
				oPerlishArray.add(input.substring(start, i+1));
			}
		}
		
		System.out.println("단어의 개수: " + oPerlishArray.size());
		
		//System.out.println(arr.length);
		for (int i = 0; i < oPerlishArray.size(); i++) {
			System.out.format("[%d] = %s%n", i, oPerlishArray.get(i));
		}
	}

}
