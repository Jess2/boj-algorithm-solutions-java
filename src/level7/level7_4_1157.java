//백준저지 알고리즘 7_4_1157
//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

package level7;

import java.util.*;

public class level7_4_1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단어 입력 : ");
		String str = sc.next();
		
		str = str.toUpperCase();
		char[] charArr = str.toCharArray();
		int[] alphaArr = new int[26];
		int max = 0;
		int maxIndex = 0;
		
		for(int i=0; i<alphaArr.length; i++) {
			for(int j=0; j<charArr.length; j++) {
				if(charArr[j] == (char)(i+65)) {
					alphaArr[i] += 1;
				}	
			}
		}
		
		
		for(int i=0; i<alphaArr.length; i++) {
			if(alphaArr[i]>max) {
				max = alphaArr[i];
				maxIndex = i+65;
			} else if(alphaArr[i]==max) {
				maxIndex = 63;
			}
		}
		
		System.out.println((char)(maxIndex));
		
		

	}

}
