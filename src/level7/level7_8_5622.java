//문제 출처 : https://www.acmicpc.net/problem/5622
//BOJ level7_8_5622
//숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
//상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.
//할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 시간을 구하는 프로그램을 작성하시오.
//check please

package level7;

import java.util.Scanner;

public class level7_8_5622 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳 문자열 입력 : ");
		String str = sc.next();
		char[] chArr = str.toCharArray();
		int[] intArr = new int[chArr.length];
		int time = 0;
		
		for(int i=0; i<chArr.length; i++) {
			if(chArr[i] == 'A' || chArr[i] == 'B' || chArr[i] == 'C') {
				intArr[i] = 2;
			}
			else if(chArr[i] == 'D' || chArr[i] == 'E' || chArr[i] == 'F') {
				intArr[i] = 3;
			}
			else if(chArr[i] == 'G' || chArr[i] == 'H' || chArr[i] == 'I') {
				intArr[i] = 4;
			}
			else if(chArr[i] == 'J' || chArr[i] == 'K' || chArr[i] == 'L') {
				intArr[i] = 5;
			}
			else if(chArr[i] == 'M' || chArr[i] == 'N' || chArr[i] == 'O') {
				intArr[i] = 6;
			}
			else if(chArr[i] == 'P' || chArr[i] == 'Q' || chArr[i] == 'R' || chArr[i] == 'S') {
				intArr[i] = 7;
			}
			else if(chArr[i] == 'T' || chArr[i] == 'U' || chArr[i] == 'V') {
				intArr[i] = 8;
			}
			else if(chArr[i] == 'W' || chArr[i] == 'X' || chArr[i] == 'Y' || chArr[i] == 'Z') {
				intArr[i] = 9;
			}
		}
		
		for(int i=0; i<intArr.length; i++) {
			time += (intArr[i] + 1);
		}
		
		System.out.println(time);

	}

}
