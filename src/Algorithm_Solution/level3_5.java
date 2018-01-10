package Algorithm_Solution;

import java.util.*;

public class level3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("100보다 작거나 같은 자연수를 입력하세요 : ");
			String input = scanner.nextLine();
			int num = Integer.parseInt(input);
			
			if(num>=1 && num<=100) {
				for(int i=1; i<=num; i++) {
					for(int j=0; j<num-i; j++) {
						System.out.print(" ");
					}
					for(int k=0; k<i; k++) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			} else {
				System.out.println("100보다 작거나 같은 자연수를 입력하지 않았습니다.");
				continue;
			}
		}
	}

}
