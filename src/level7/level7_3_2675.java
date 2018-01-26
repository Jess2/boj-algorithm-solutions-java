//백준저지 알고리즘 7_3_2675
//문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 T를 만든 후 출력하는 프로그램을 작성하시오.

package level7;

import java.util.Scanner;

public class level7_3_2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반복할 수와 문자열을 입력하세요 : ");
		int num = sc.nextInt(); //반복할 수 입력받아서 num에 저장 
		String str = sc.next(); //문자열 입력받아서 str에 저장 
		
		char[] charArr = str.toCharArray(); //입력받아서 저장한 str을 char형 배열로 변환 저장 
		
		for(int i=0; i<charArr.length; i++) { //입력받은 문자열의 길이만큼 반복 
			for(int j=0; j<num; j++) { //반복할 수인 num만큼 반복 
				System.out.print(charArr[i]); //문자 출력 
			}
		}

	}

}
