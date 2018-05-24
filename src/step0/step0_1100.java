//https://www.acmicpc.net/problem/1100

package step0;

import java.util.Scanner;

public class step0_1100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		char[][] chess = new char[8][8];
		int count = 0;
		String str;
		
		for(int i=0; i<chess.length; i++) {
			str = sc.next();
			for(int j=0; j<chess[i].length; j++) {
				chess[i][j] = str.charAt(j);
			}
		}
		
		for(int i=0; i<chess.length; i++) {
			for(int j=0; j<chess[i].length; j++) {
				if((i + j) % 2 == 0 && chess[i][j] == 'F') {
					count++;
				}
			}
		}
		
		System.out.println(count);

	}

}
