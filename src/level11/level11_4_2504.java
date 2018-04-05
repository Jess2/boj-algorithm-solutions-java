//https://www.acmicpc.net/problem/2504

package level11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class level11_4_2504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); //괄호를 입력받음
				
		int count2 = 0; // '('열려있는 괄호의 수를 저장
		int count3 = 0; // '['열려있는 괄호의 수를 저장
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '(') {
				count2++;
			} else if(str.charAt(i) == ')') {
				if(count2 > 0) {
					count2--;	
				} else {
					count2--;
					break;
				}
				
			} else if(str.charAt(i) == '[') {
				count3++;
			} else if(str.charAt(i) == ']') {
				if(count3 > 0 ) {
					count3--;
				} else {
					count3--;
					break;
				}
			}
		}
		
		List<Integer> list = new ArrayList<>();  //동적 배열 생성
		int loc = -1;
		
		if(count2 == 0 && count3 == 0) { //올바른 괄호일 경우
			int open2 = 0;
			int open3 = 0;
			int close2 = 0;
			int close3 = 0;
			for(int i=0; i<str.length(); i++) {
				if(open2 == close2 && open3 == 0 && str.charAt(i) == '(') {
					open2++;
					list.add(1);
					list.set(loc, 2);
				} else if(open2 == 0 && open3 == 0 && str.charAt(i) == '[') {
					open3++;
					list.add(1);
					list.set(loc, 3);
				} else if((open2 != 0 || open3 != 0) && str.charAt(i) == '(') {
					list.set(loc, (list.get(loc)*2));
//					for(int j=0; j<count2; j++) {
//						list.set(loc, (list.get(loc)*2));
//					}
					open2++;
				} else if((open2 != 0 || open3 != 0) && str.charAt(i) == '[') {
					if(open2 != close2) {
						loc++;
					} 
					list.set(loc, (list.get(loc)*3));
//					for(int j=0; j<count3; j++) {
//						list.set(loc, (list.get(loc)*3));
//					}
					open3++;
				} else if(str.charAt(i) == ')') {
					
					close2++;
				} else if(str.charAt(i) == ']') {
					close3++;
				}
			}
		} else { //올바른 괄호가 아닐 경우
			System.out.println(0);
		}

	}

}
