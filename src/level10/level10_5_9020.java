//https://www.acmicpc.net/problem/9020

package level10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class level10_5_9020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		int input;
		
		for(int i=0; i<testCase; i++) {
			List<Integer> list = new ArrayList<>();  //동적 배열 생성
			input = sc.nextInt();
			boolean b; //소수인지 아닌지의 값을 넣는 변수
			int half = (int)Math.sqrt(input)+1;

			list.add(2);
			for(int j=2; j<=input; j++) {
				b = true;
				for(int k=2; k<half; k++) {
					if(j % k == 0) { //소수가 아닐 경우
						b = false;
						break;
					}
				}
				if(b == true) { //소수일 경우
					list.add(j); 
				}
			}
			
			int minDiff = input;
			int result1 = 0;
			int result2 = 0;
			
			for(int j=0; j<list.size(); j++) {
				for(int k=0; k<list.size(); k++) {
					if(list.get(j) + list.get(k) == input && minDiff > Math.abs(list.get(j) - list.get(k))) {
						minDiff = Math.abs(list.get(j) - list.get(k)); //절대값
						result1 = list.get(j);
						result2 = list.get(k);
					}
				}
			}

			System.out.println(result1 + " " + result2);
		}

	}

}
