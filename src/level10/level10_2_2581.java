//BOJ level10_2_2581
//성공

package level10;

import java.util.Scanner;

public class level10_2_2581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt(); //처음 값
		int end = sc.nextInt(); //마지막 값
		
		int temp = start; //처음 값을 저장한 변수
		int sum = 0; //소수의 합계
		int min = 0; //소수의 최소값
		
		int[] arr = new int[end-start+1]; //배열 생성
		
		while(temp <= end) {
			arr[temp-start] = temp; //배열에 temp의 값을 차례대로 저장
			if(temp == 1) { //temp가 1일 경우, 1은 소수가 아니므로 배열에 0을 저장
				arr[temp-start] = 0;
			}
			for(int i=2; i<temp; i++) { 
				if(temp % i == 0) {
					arr[temp-start] = 0; //소수가 아니면 배열에 0을 저장
					break;
				}
			}
			temp++;
		}
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i]; //소수의 합계를 구함
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) { //소수일 경우 최초값을 min에 저장하고 반복문 탈출
				min = arr[i];
				break;
			}
		}
		
		if(min != 0) { //최소값이 존재할 경우(소수인 것이 하나라도 있을 경우) 소수의 합계와 최소값을 출력
			System.out.println(sum+"\n"+min);
		} else { //소수인 것이 하나도 없을 경우 -1을 출력
			System.out.println(-1);
		}
		

	}

}
