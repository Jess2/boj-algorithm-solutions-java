package level6;

import java.util.Arrays;
import java.util.Scanner;

public class level6_4_2920 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr = new int[8];
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("음계 입력 : ");
//		for(int i=0; i<8; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		int[] ascendingArr = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
//		int[] descendingArr = new int[] {8, 7, 6, 5, 4, 3, 2, 1};
//		
//		if(Arrays.equals(ascendingArr, arr)) {
//			System.out.println("ascending");
//		} else if(Arrays.equals(descendingArr, arr)) {
//			System.out.println("descending");
//		} else {
//			System.out.println("mixed");
//		}
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scale = new int[8];
		String result = null;

		for (int i = 0; i < scale.length - 1; i++) { // 0, 1, 2, 3, 4, 5, 6
			scale[i] = sc.nextInt();

			if(result == "mixed") continue;
			
			System.out.println(scale[i+1] - scale[i]);
			
			if (scale[i+1] - scale[i] == 1) { //1-0, 2-1, 3-2, 4-3, 5-4, 6-5, 7-6
				result = "ascending";
				System.out.println(result);
			}
			else if (scale[i+1] - scale[i] == -1) {
				result = "descending";
				System.out.println(result);
			}
			else {
				result = "mixed";
				System.out.println(result);
			}
			
		}
		System.out.println(result);
		sc.close();
	}

}
