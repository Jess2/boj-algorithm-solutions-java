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
		
		boolean[] arr = new boolean[n];
		Queue<Integer> queue = new LinkedList<Integer>();
		
		int loc = 0;
		int k = 0;
		
		while (queue.size() < n) {
			if(!arr[k%n]) { //false이면 실행
				loc += 1;
				if(loc == m) {
					queue.add(k%n + 1);
					loc = 0;
					arr[k%n] = true;
				}
			}
			k++;
		}
		
		System.out.print(queue.toString().replace("[", "<").replace("]", ">"));

	}
}
