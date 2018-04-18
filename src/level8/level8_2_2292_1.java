//https://www.acmicpc.net/problem/2292

package level8;

import java.util.Scanner;

public class level8_2_2292_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //입력받은 값 
		int cycle = 0;
		int cycleMin = 2;
		
		while(true) {
			if(num < cycleMin) {
				System.out.println(cycle+1);
				break;
			} else if(num >= cycleMin) {
				cycleMin += 6 * (++cycle);
				continue;
			} else {
				break;
			}
		}
	}

}
