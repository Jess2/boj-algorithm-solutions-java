//https://www.acmicpc.net/problem/1193
//BOJ level8_3_1193
//check

package level8;

import java.util.Scanner;

public class level8_3_1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(); //사용자로부터 값을 입력받아서 input에 저장 
		
		int row = find(input); //몇 번째 줄인지 찾아서 row에 저장
		System.out.println(row);
		
		int line;
		int top = row;
		int bottom = 0;
		
		if(row % 2 == 0) { //짝수 번째 줄일 경우
			if(input % row == 0) {
				top = 1;
				bottom = row;
			} else {
				line = input % row; //몇 번째 라인인지 찾아서 line에 저장 
				System.out.println(line);
				top = row - (line - 1); //분자 
				bottom = line; //분모 
			}
		} 
		else if(row % 2 != 0) { //홀수 번째 줄일 경우
			if(input % row == 0) {
				top = 1;
				bottom = row;
			} else {
				line = input % row; //몇 번째 라인인지 찾아서 line에 저장
				top -= (line - 1); //분자
				bottom = line; //분모 
			}
		}
		
		System.out.println(top+"/"+bottom);

	}
	
	//몇 번째 줄인지 찾는 메소드 
	private static int find(int input) {
		int n = 1;
		while(true) {
			if(input > ((n-1)*n)/2 && input <= (n*(n+1))/2) {
				return n;
			}
			n++;
		}
	}

}
