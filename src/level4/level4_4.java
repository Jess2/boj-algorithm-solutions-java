//백준저지 알고리즘 1546

package level4;

import java.util.Arrays;
import java.util.Scanner;

public class level4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt(); //시험 본 과목의 개수
		
		int[] arr = new int[num]; //원래 성적 배열
		float sum = 0;
		
		scanner.nextLine();
		
		for(int i=0; i<num; i++) {
			arr[i] = scanner.nextInt();
		}
		
		Arrays.sort(arr);
		int max = arr[num-1]; //최대 점수
		
		for(int i=0; i<num; i++) { //새로운 점수 계산
			sum += ((float)arr[i]/max)*100;
		}
		
		sum /= num;
		
		System.out.printf("%.2f", sum);
	}

}
