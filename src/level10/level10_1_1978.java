//BOJ level10_1_1978
//성공

package level10;

import java.util.Scanner;

public class level10_1_1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //입력할 수의 개수를 입력받음
		int[] arr = new int[num]; //개수만큼의 크기의 int형 배열을 생성
		
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt(); //반복문을 돌며 입력받은 수들을 배열에 저장
		}
		
		int result = num; //결과를 출력하기 위한 변수 result에 기존 수의 개수를 저장
		
		for(int i=0; i<num; i++) {
			if(arr[i] == 1) { //입력받은 수가 1일 경우, 1은 소수가 아니므로 result 1 감소시킴
				result--;
			}
			for(int j=2; j<arr[i]; j++) { //입력받은 수가 2일 경우, 2는 소수이므로 안의 조건문을 확인할 필요가 없다.
				if(arr[i] % j == 0) { //입력받은 수를 그 수보다 작은 값으로 나누어지면 소수가 아니다. 단 1로는 모든 수가 나누어지기 때문에 제외하고 2부터 반복문 시작.
					result--;
					break; //만약에 입력받은 수가 소수가 아닐 경우, for문을 탈출하고 다음에 입력받은 수를 따진다.
				}
			}
		}
		
		//소수의 개수 출력
		System.out.println(result);

	}

}
