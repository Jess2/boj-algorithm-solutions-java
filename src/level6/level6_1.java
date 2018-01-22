//백준저지 알고리즘 1152

package level6;

import java.util.*;

public class level6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start = 0; //단어의 시작 위치
		List<Object> oPerlishArray = new ArrayList<Object>(); //동적배열 생성
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문장 입력 : ");
		String input = scanner.nextLine();
		
		for(int i=0; i<input.length(); i++) {
			//공백 전까지의 단어 add
			if(input.charAt(i)==' ' && input.charAt(i-1) != ' ') {
				oPerlishArray.add(input.substring(start, i));
				start = i+1; //다음 단어의 시작위치 수정
			}
			
			//마지막 단어 add
			if(i==input.length()-1) {
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
