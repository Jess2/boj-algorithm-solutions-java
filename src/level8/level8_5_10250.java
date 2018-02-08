//BOJ level8_5_10250

package level8;

import java.util.Scanner;

public class level8_5_10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		int[] H = new int[testCase];
		int[] W = new int[testCase];
		int[] N = new int[testCase];
		

		
		String[] result = new String[testCase];
		
		for(int i=0; i<testCase; i++) {
			H[i] = sc.nextInt();
			W[i] = sc.nextInt();
			N[i] = sc.nextInt();
		}
		
		for(int i=0; i<testCase; i++) {
			int x = 0;
			int y = 0;
			if(H[i] == 1) {
				x = N[i];
				y = 1;
			} else if(N[i] % H[i] == 0) {
				x = H[i];
				y = (N[i] / H[i]);
			}else {
				x = N[i] % H[i];
//				if(N[i] / H[i] >= 9) {
//					x = x*10;
//				}
				y = (N[i] / H[i]) + 1;
			}
			if(y<10) {
				result[i] = x + "0" + y;
			} else {
				result[i] = x + "" + y; 
			}
		}
		
		for(int i=0; i<testCase; i++) {
			System.out.println(result[i]);
		}

	}

}
