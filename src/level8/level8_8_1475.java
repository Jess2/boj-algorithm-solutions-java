//https://www.acmicpc.net/problem/1475

package level8;

import java.util.Arrays;
import java.util.Scanner;

public class level8_8_1475 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double count = 1;
		double max = 1;
		
		Scanner sc = new Scanner(System.in);
		
		String numstr = sc.next(); //숫지를 문자열로 입력받음
		numstr = numstr.replace("9", "6"); //9를 전부 6으로 변경
		
		int[] num = new int[numstr.length()]; //int형 배열

		for(int i=0; i<numstr.length(); i++) {
			num[i] = numstr.charAt(i) - '0'; //int형 배열에 아까 숫자를 문자열로 바꾼 것을 저장
		}
		
		Arrays.sort(num); //정렬

		for(int i=0; i<numstr.length()-1; i++) {
			if(num[i] == num[i+1]) { //같으면 count 증가
				if(num[i] == 6) { //6일 때는 count를 반만 증가시킴
					count += 0.5;
				} else if(num[i] != 6) { //6이 아닐 때는 count를 1 증가시킴
					count += 1;	
				}
				if(count > max) { //max값보다 count값이 더 크면 max에 count를 저장
					max = count;
				}
			} else {
				count = 1; //다르면 count 초기화
			}
		}
		
		System.out.println((int)max); //max값 출력

	}

}
