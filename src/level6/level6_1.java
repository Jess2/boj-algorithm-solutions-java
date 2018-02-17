//백준저지 알고리즘 1152

package level6;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class level6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start = 0; //단어의 시작 위치
		List<Object> listArr = new ArrayList<Object>(); //동적배열 생성
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		for(int i=1; i<input.length(); i++) {
			//공백 전까지의 단어 add
			if(input.charAt(i)==' ' && input.charAt(i-1)!=' ') { //현재의 위치가 공백이고, 현재 위치보다 바로 왼쪽에 위치한 곳은 공백이 아닐 경우 동적배열에 추가
				listArr.add(input.substring(start, i));
				start = i+1; //다음 단어의 시작위치 수정
			}
			
			//마지막 단어 add (마지막 단어 다음에는 공백이 없을 수 있기 때문에 따로 고려해줘야 한다.)
			if(i==input.length()-1 && input.charAt(input.length()-1)!=' ') { //현재의 위치가 입력받은 문장의 마지막 위치이고 입력받은 문장의 마지막 위치의 값이 공백이 아닐 경우 동적배열에 추가
				listArr.add(input.substring(start, i+1));
			}
		}
		
		System.out.println(listArr.size());
		
		//배열의 원소 출력
//		for (int i = 0; i < listArr.size(); i++) {
//			System.out.format("[%d] = %s%n", i, listArr.get(i));
//		}

	}

}
