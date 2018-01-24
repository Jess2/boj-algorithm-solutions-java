//BOJ level7_5_1316
//그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
//예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
//단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

//check please

package level7;

import java.util.*;

public class level7_5_1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력할 단어의 개수와 단어를 입력하세요 : ");
		int num = sc.nextInt();
		
		char[][] charArr = new char[num][];
		
		for(int i=0; i<num; i++) {
			String str = sc.next();
			charArr[i] = new char[str.length()];
			charArr[i] = str.toCharArray();
		}
		
		String str;
		
		
		for(int i=0; i<charArr.length; i++) {
			str = "";
			for(int j=0; j<charArr[i].length; j++) {
				if(str.contains(String.valueOf(charArr[i][j])) && charArr[i][j] != charArr[i][j-1]) {
					num--;
				}
				str += String.valueOf(charArr[i][j]);
			}

			
		}
		
		System.out.println(num);

	}

}
