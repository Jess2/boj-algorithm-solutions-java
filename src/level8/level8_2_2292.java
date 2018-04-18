//https://www.acmicpc.net/problem/2292
//시간초과

package level8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class level8_2_2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //입력받은 값 
		int result = 0; //결과 값 
		
		List<Integer> list = new ArrayList<>();  //동적 배열 생성
		list.add(2); //0번째 인덱스에 2 추가 
		
		int x = num/6 + 1;
		
		for(int i=1; i<=x; i++) {
			list.add(list.get(i-1) + (6*i)); //동적 배열에 2,8,20,38 등 한 사이클에서 가장 작은 수를 동적 배열에 추가
		}
		
		for(int i=0; i<list.size()-1; i++) {
			if(num >= list.get(i) && num < list.get(i+1)) { //입력받은 num의 값이 몇 번째 사이클에 속해 있는지 구함
				if(i == 0) {
					result = 1;
				} else {
					result = i+2;	
				}
			}
		}
		
		System.out.println(result);
		
	}

}
