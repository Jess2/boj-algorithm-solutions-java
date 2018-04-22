//https://www.acmicpc.net/problem/2490

package level17;

import java.util.Scanner;

public class level17_2_2490 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		int num = 0;
		
		for(int i=0; i<3; i++) {
			num = 0;
			for(int j=0; j<4; j++) {
				input = sc.nextInt();
				if(input == 0) {
					num++;
				}
			}
			switch(num) {
			case 1:
				System.out.println("A");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("C");
				break;
			case 4:
				System.out.println("D");
				break;
			case 0:
				System.out.println("E");
				break;
			}
		}
	
	}

}
