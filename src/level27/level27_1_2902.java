//https://www.acmicpc.net/problem/2902

package level27;

import java.util.Scanner;

public class level27_1_2902 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] arr = str.split("-"); 
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i].charAt(0));
		}		

	}

}
