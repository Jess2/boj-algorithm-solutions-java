//https://www.acmicpc.net/problem/13241

package level18;

import java.util.Scanner;

public class level18_2_13241 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		long num1 = sc.nextInt();
		long num2 = sc.nextInt();
			
		System.out.println(lcm(num1, num2));		
		
	}
	
	//최소공배수
	public static long lcm(long a, long b) {
		long gcd_value = gcd(a, b); //최대공약수

	    return Math.abs( (a * b) / gcd_value ); //a와 b를 곱한 값을 최대공약수로 나눈 것이 최소공배수이다.
	}

	//최대공약수
	public static long gcd(long a, long b) {
		while (b != 0) {
			long temp = a % b;
			a = b;
			b = temp;
	    }
	    return Math.abs(a);
	}

}
