//https://www.acmicpc.net/problem/1193
//BOJ level8_3_1193
//check

package level8;

import java.util.Scanner;

public class level8_3_1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //몇 번째 값을 찾고 싶은지 입력받음
		int temp = 0;
		int i = 1; //몇 번째 라인인지 저장
		int j; //몇 번째 값인지 저장
		
		while(true) {
			temp += i;
			if(num < temp) {
				temp -= i;
				break;
			}
			i++;
		}
		
		j = num - temp; 
		
		if(i%2 != 0) { //홀수
			System.out.println((i-j+1)+"/"+j);
		} else { //짝수
			System.out.println(j+"/"+(i-j+1));
		}
	}

}
