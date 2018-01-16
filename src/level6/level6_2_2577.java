//백준저지 알고리즘 level6_2_2577

package level6;

import java.util.*;

public class level6_2_2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[3];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("100~1000사이의 수 세 개 입력: ");
		
		//반복문을 돌며 세 개의 수를 입력받아서 각각 arr[0], arr[1], arr[2]에 삽입
		for(int i=0; i<arr.length; i++) {
			String input = scanner.next();
			arr[i] = Integer.parseInt(input);
		}
		
		int num = arr[0] * arr[1] * arr[2]; //입력받은 값 세개를 곱해서 변수 num에 저장 
		String numStr = String.valueOf(num); //int형 변수 num을 String형으로 형변환하여 변수 numStr에 저장 
		
		char[] charArr = numStr.toCharArray(); //String형 변수 numStr을 char형 배열로 변환. 배열 이름은 charArr 
		
		int[] resultArr = new int[10]; //결과값을 저장할 int형 배열 resultArr 생성 
		
		for(int i=0; i<resultArr.length; i++) { //resultArr 배열의 길이만큼 반복 
			for(int j=0; j<charArr.length; j++) { //charArr 배열의 길이만큼 반복 
				if(charArr[j] == Character.forDigit(i, 10)) {
					resultArr[i] += 1;
				}
			}
			
		}
		
		for(int i=0; i<resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}
		

	}

}
