//백준저지 알고리즘 1_7_11718

package level1;

import java.util.*;

public class level1_7_11718 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> inputs = new ArrayList<>(); //동적배열 생성 
		
		System.out.println("문장 입력 : ");
		
		while(scanner.hasNextLine()) { //다음 줄이 있을 경우
			String input = scanner.nextLine(); //입력받은 값을 String형 변수 input에 대입 
			if(input==null || input.isEmpty()) { //입력받은 값이 비어있을 경우 반복문 탈출 
				break;
			}
			inputs.add(input); //동적배열 inputs에 할당 
			
		}
		
		for(int i=0; i<inputs.size(); i++) { //동적배열 inputs의 길이만큼 반복 
			System.out.println(inputs.get(i)); //동적배열 inputs의 값을 순서대로 출력 
		}
		
		

	}

}
