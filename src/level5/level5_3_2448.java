//백준저지 알고리즘 5_3_2448
package level5;

import java.util.*;

public class level5_3_2448 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int n = sc.nextInt();

		int k = log(n/3);
		char[][] arr = new char[n][3*(2^k)];
		System.out.println(k);
		
		int last = (int) (3*(Math.pow(2, k+1)));
		System.out.println(last);
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<last; j++) {
				if((i+1)%3 == 1) {
					arr[i][j] = ' ';
					if(j==(last/2)-1) {
						arr[i][j] = '*';
					}
				} 
				else if((i+1)%3 == 2){
					arr[i][j] = ' ';
					if((j+1)%2 == 0) {
						arr[i][j] = '*';
					}
				}
				else {
					arr[i][j] = '*';
				}
				
				if((j+1)%6 == 0 && j != 0) {
					arr[i][j] = ' ';
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<last; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		
	}

	private static int log(int i) {
		// TODO Auto-generated method stub
		
		int result = 0;

		while(i == (2^result)) {
			result ++;
		}
		return result;
	}
}


