//https://www.acmicpc.net/problem/2292
//BOJ level8_2_2292
//위의 그림과 같이 육각형으로 이루어진 벌집이 있다. 그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다.
//숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오.
//예를 들면, 13까지는 3개, 58까지는 5개를 지난다.

package level8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class level8_2_2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = 0;
		
		List<Integer> list = new ArrayList<>();  //동적 배열 생성
		list.add(2);
		
		for(int i=1; i<=18300; i++) {
			list.add(list.get(i-1) + (6*i));
		}
		
		for(int i=0; i<18300; i++) {
			if(num >= list.get(i) && num < list.get(i+1)) {
				result = i+2;
			}
		}
		
		System.out.println(result);
	
		
//		for (int i=1; i<=10000; i++) {
//			list.add(d(i)); //셀프넘버가 아닌 숫자들을 동적배열 list에 할당 
//		}
//		
//		for (int i=1; i<=10000; i++) {
//			if (!list.contains(i)) { //동적배열 list에 없는 숫자, 즉 셀프넘버일 경우 출력 
//				System.out.println(i);
//			}
//		}
		

	}

}
