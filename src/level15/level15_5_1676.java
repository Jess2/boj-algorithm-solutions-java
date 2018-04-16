//https://www.acmicpc.net/problem/1676

package level15;

import java.util.Scanner;

public class level15_5_1676 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = num/5 + num/25 + num/125; 
		
		System.out.println(cnt);
		
	}

}
