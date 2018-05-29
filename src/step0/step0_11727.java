package step0;

import java.util.Scanner;

public class step0_11727 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ary[] = new int[3];//n, n-1, n-2항을 담아낼 정수배열 생성
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();//n의 크기를 입력받음
        int result;

        for (int i=0; i<n; i++){
        	if (i == 0){
        		ary[0] = 0;
        		ary[1] = 1;
        		ary[2] = 1;
        	}//초기조건, n이 1일때 값 설정
        	else{
        		ary[0] = ary[1];
        		ary[1] = ary[2];
        		ary[2] = (ary[1] + (ary[0] * 2)) % 10007; //문제 조건 : 정답은 10007로 나눈 나머지
        	} 
        }
        result = ary[2];
        System.out.println(result);
        scan.close();

	}

}