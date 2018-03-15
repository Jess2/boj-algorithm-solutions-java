//https://www.acmicpc.net/problem/2504

package level11;

import java.util.Scanner;

public class level11_4_2504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int count1 = 0;
		int count2 = 0;
		int result = 0;
		char[] tempArr = new char[30];
		int top = -1;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '(') {
				count1++;
				tempArr[++top] = '(';
			} else if(tempArr[top] == '(' && str.charAt(i) == ')') {
				if(count1 > 0) {
					count1--;
					top--;
					result += 2;
				} else {
					count1--;
					break;
				}
			} else if(str.charAt(i) == '[') {
				count2++;
				tempArr[++top] = '[';
			} else if(tempArr[top] == '[' && str.charAt(i) == ']') {
				if(count2 > 0) {
					count2--;
					top--;
					result += 3;
				} else {
					count2--;
					break;
				}
			}
		}
		
		if(count1 == 0 && count2 == 0) {
			System.out.println(result);
		} else {
			System.out.println(0);
		}

	}

}
