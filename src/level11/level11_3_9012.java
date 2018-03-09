//https://www.acmicpc.net/problem/9012
	
package level11;

import java.util.Scanner;

public class level11_3_9012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		int count;
		
		for(int i=0; i<testCase; i++) {
			count = 0;
			String str = sc.next();
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) == '(') {
					count++;
				} else if(str.charAt(j) == ')') {
					if(count > 0) {
						count--;	
					} else {
						count--;
						break;
					}
					
				}
			}
			if(count == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

}
