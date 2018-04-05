//https://www.acmicpc.net/problem/11866

package level12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class level12_4_11866 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt(); //사람 수
		int m = sc.nextInt(); //제거할 위치
		
		boolean[] arr = new boolean[n]; //사람 수만큼의 배열 생성. 처음에는 전부 false로 초기화 되어있다.
		Queue<Integer> queue = new LinkedList<Integer>(); //큐 생성
		
		int loc = 0; //현재위치 0으로 지정
		int k = 0;
		
		while (queue.size() < n) { //큐의 길이가 사람 수보다 작으면 실행
			if(!arr[k%n]) { //false이면 실행
				loc += 1; //현재위치 1 증가
				if(loc == m) { //현재위치와 제거하고싶은 위치가 같아질 경우
					queue.add(k%n + 1);
					loc = 0; //현재위치를 0으로 되돌림
					arr[k%n] = true; //배열에 true를 저장
				}
			}
			k++; //k 증가
		}
		
		System.out.print(queue.toString().replace("[", "<").replace("]", ">")); //toString 메소드 이용하여 큐 출력

	}
}
