//https://www.acmicpc.net/problem/1874

package level11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class level11_2_1874 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int stackSize = sc.nextInt(); //수열의 길이를 입력받음
		int[] arr = new int[stackSize];
		int[] stackArr = new int[stackSize];
		int pushItem = 1;
		int top = -1;
		int loc = 0;
		List<Character> list = new ArrayList<>();  //동적 배열 생성
		
		for(int i=0; i<stackSize; i++) {
			arr[i] = sc.nextInt(); //수열의 원소들을 차례대로 입력받아 배열 arr에 저장 
		}
		
		while(true) {
			if(top != -1 && stackArr[top] == arr[loc]) {
				top--;
				loc++;
				list.add('-'); //pop
			} else if(pushItem <= stackSize) {
				stackArr[++top] = pushItem++;
				list.add('+'); //push
			} else {
				break;
			}
		}
	
		if(top == -1) {
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
		} else {
			System.out.println("NO");
		}
			

	}

}
