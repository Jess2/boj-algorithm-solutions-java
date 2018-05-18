//https://www.acmicpc.net/problem/10808

package step0;

import java.util.Scanner;

public class step0_10808 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int[] arr = new int['z'-'a'+1];
		
		for(int i=0; i<str.length(); i++) {
			arr[(int)str.charAt(i) - 97] ++;	
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
