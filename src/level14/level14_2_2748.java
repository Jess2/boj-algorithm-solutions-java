//https://www.acmicpc.net/problem/2748

package level14;

import java.util.Scanner;

public class level14_2_2748 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		long input = sc.nextInt(); //입력값
		long pre = 0;
		long temp = 0;
		long result = 1; //결과
		
		for(int i=0; i<input-1; i++) {
			temp = result;
			result = pre + result;
			pre = temp;
		}
		
		System.out.println(result);
	}

}
