//문제출처 : https://www.acmicpc.net/problem/2941
//BOJ level7_9_2941
//예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 다음과 같이 변경해서 입력했다.
//예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다.
//단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
//check please

package level7;

import java.util.Scanner;

public class level7_9_2941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int length = str.length();
		
		String[] strArr = new String[] {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(int j=0; j<strArr.length; j++) {
			for(int i=0; i<str.length()-2; i++) {
				String newStr = str.substring(i,i+3);
				if(newStr.contains(strArr[j])) {
					str = str.replaceFirst(strArr[j], "__");
					length = length - strArr[j].length() + 1;
				}
			}
		}
		
		System.out.println(length);

	}

}
