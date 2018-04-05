//https://www.acmicpc.net/problem/10866

package level13;

import java.util.Scanner;

public class level13_1_10866 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt(); //명령의 개수 입력받음
		int rear = -1; //마지막 값이 들어있는 인덱스
		int[] itemArray = new int[10000]; //배열
		
		for(int i=0; i<testCase; i++) {
			String str = sc.next(); //명령문 입력받음
			switch(str) {
				//push_front X: 정수 X를 덱의 앞에 넣는다.
				case "push_front":
					int item_front = sc.nextInt();
					rear++; //마지막 인덱스 증가시킴
					for(int j=rear; j>0; j--) { //한 칸씩 뒤로 밀기
						itemArray[j] = itemArray[j-1];
					}
					itemArray[0] = item_front; //덱의 맨 앞에 item을 삽입
					break;
			
				//push_back X: 정수 X를 덱의 뒤에 넣는다.
				case "push_back":
					int item_back = sc.nextInt();
					itemArray[++rear] = item_back;
					break;
					
				//pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				case "pop_front":
					if(rear == -1) {
						System.out.println(-1);
					} else {
						System.out.println(itemArray[0]); //덱의 가장 앞에 있는 수를 출력
						for(int j=0; j<rear; j++) {
							itemArray[j] = itemArray[j+1]; //한 칸씩 앞으로 당기기
						}
						rear--;
					}
					break;
					
				//pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				case "pop_back":
					if(rear == -1) {
						System.out.println(-1);
					} else {
						System.out.println(itemArray[rear--]); //덱의 가장 뒤에 있는 수를 출력
					}
					break;
					
				//size: 덱에 들어있는 정수의 개수를 출력한다.
				case "size":
					System.out.println(rear+1);
					break;
					
				//empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
				case "empty":
					if(rear == -1) {
						System.out.println(1);
					} else {
						System.out.println(0);
					}
					break;
					
				//front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				case "front":
					if(rear == -1) {
						System.out.println(-1);
					} else {
						System.out.println(itemArray[0]);
					}
					break;
					
				//back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				case "back":
					if(rear == -1) {
						System.out.println(-1);
					} else {
						System.out.println(itemArray[rear]);
					}
					break;
			}
		}


	}

}
