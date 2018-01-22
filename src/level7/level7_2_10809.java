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
		
		for(int i=97; i<123; i++) {
			System.out.print(str.indexOf(Character.toString((char)i))+" ");
		}

	}

}
