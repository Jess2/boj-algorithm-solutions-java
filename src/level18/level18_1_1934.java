//https://www.acmicpc.net/problem/1934

package level18;

import java.util.Scanner;

public class level18_1_1934 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println(gcd(num1, num2));
		System.out.println(lcm(num1, num2));
				
	}
	
	//최소공배수
	public static int lcm(int a, int b) {
		int gcd_value = gcd((int)a, (int)b); //최대공약수

	    return Math.abs( (a * b) / gcd_value ); //a와 b를 곱한 값을 최대공약수로 나눈 것이 최소공배수이다.
	}

	//최대공약수
	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
	    }
	    return Math.abs(a);
	}

}
