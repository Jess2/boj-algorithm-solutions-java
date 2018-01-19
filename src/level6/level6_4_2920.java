package level6;

import java.util.Arrays;
import java.util.Scanner;

public class level6_4_2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[8];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("음계 입력 : ");
		for(int i=0; i<8; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] ascendingArr = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
		int[] descendingArr = new int[] {8, 7, 6, 5, 4, 3, 2, 1};
		
		if(Arrays.equals(ascendingArr, arr)) {
			System.out.println("ascending");
		} else if(Arrays.equals(descendingArr, arr)) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}

}
