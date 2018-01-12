//백준저지 알고리즘 1546

package Algorithm_Solution.level4;

import java.util.*;

public class level4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("시험 본 과목의 개수 입력(1~1000) : ");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input); //시험 본 과목의 개수
		
		int[] arr = new int[num]; //원래 성적 배열
		int sum = 0;
		
		System.out.print("현재 성적 입력(1~100) : ");
		for(int i=0; i<num; i++) {
			String input2 = scanner.next();
			arr[i] = Integer.parseInt(input2);
		}
		
		Arrays.sort(arr);
		int max = arr[num-1]; //최대 점수
		
		for(int i=0; i<num; i++) {
			sum += (arr[i]*100)/max; //새로운 점수 계산
		}
		
		double newAverage = sum/num;
		
		System.out.printf("%.2f", newAverage);
	}

}
