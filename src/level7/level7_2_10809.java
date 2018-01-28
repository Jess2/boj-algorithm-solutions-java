//백준저지 알고리즘 7_2_10809
//알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

package level7;

import java.util.*;

public class level7_2_10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 소문자로 이루어진 단어 입력 : ");
		String str = sc.next();
		
		//System.out.println(str.indexOf('a'));
		
//		for(int i='a'; i<'z'+1; i++) {
//			System.out.print(str.indexOf(Character.toString((char)i))+" ");
//		}
		
		for(char i='a'; i<'z'+1; i++) {
			System.out.print(str.indexOf(Character.toString(i))+" ");
		}
		
//		indexOf(문자)
//		- 해당 문자가 들어있는 위치를 알려 줍니다.(문자가 없으면 -1 반환)
//		예) "abcde".indexOf("e")에는 4가 읽어 집니다. 0부터 시작하기 때문입니다.(lastIndexOf는 뒤에서부터 셈)

	}

}
