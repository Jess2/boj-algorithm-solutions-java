//https://www.acmicpc.net/problem/1094

package level19;

import java.util.Scanner;

public class level19_2_1094 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int temp = 64;
		int count = 1;
		
		while(true) {
			if(X < temp) {
				temp /= 2;
				
			} else if(X > temp) {
				X -= temp;
				count++;
			} else {
				break;
			}
		}
		
		System.out.println(count);

	}

}
