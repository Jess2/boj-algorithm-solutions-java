//https://www.acmicpc.net/problem/1085

package step0;

import java.util.Scanner;

public class step0_1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int min = w - x;
		
		if(x < min) {
			min = x;
		}
		if(h - y < min) {
			min = h - y;
		}
		if(y < min) {
			min = y;
		}
		
		System.out.println(min);

	}

}
