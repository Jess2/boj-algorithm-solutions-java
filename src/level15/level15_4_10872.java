//https://www.acmicpc.net/problem/10872

package level15;

import java.util.Scanner;

public class level15_4_10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int result = 1;
		
		for(int i=num; i>0; i--) {
			result *= i;
		}
		
		System.out.println(result);

	}

}
