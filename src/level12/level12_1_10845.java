//https://www.acmicpc.net/problem/10845

package level12;

import java.util.Scanner;

public class level12_1_10845 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		int front = -1; //앞 부분, 삭제가 이루어짐
		int rear = -1; //뒷 부분, 삽입이 이루어짐
		int[] itemArray = new int[10000]; //큐를 나타낼 배열
		
		for(int i=0; i<testCase; i++) {
			String str = sc.next(); //명령문 입력받음
			switch(str) {
				case "push": //push X: 정수 X를 큐에 넣는 연산이다.
					int item = sc.nextInt();
					itemArray[++rear] = item; //삽입
					break;
					
				case "pop": //pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
					if(front == rear) { //큐가 비어있을 경우 -1을 출력
						System.out.println(-1);
					} else { //큐에 무언가가 들어있을 경우, 큐에서 가장 앞에 있는 정수를 빼고 그 수를 출력
						System.out.println(itemArray[front++]);
					}
					break;
					
				case "size": //size: 큐에 들어있는 정수의 개수를 출력한다.
					System.out.println(rear-front);
					break;
					
				case "empty": //empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
					if(front == rear) { //큐가 비어있을 경우
						System.out.println(1);
					} else { //큐가 비어있지 않을 경우
						System.out.println(0);
					}
					break;
					
				case "front": //front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
					if(front == rear) { //큐가 비어있을 경우 -1을 출력
						System.out.println(-1);
					} else {
						System.out.println(itemArray[front+1]);
					}
					break;
				
				case "back": //back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
					if(front == rear) { //큐가 비어있을 경우 -1을 출력
						System.out.println(-1);
					} else {
						System.out.println(itemArray[rear]);
					}
					break;
			}
		}

	}

}
