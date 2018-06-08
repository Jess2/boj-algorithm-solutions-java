//https://www.acmicpc.net/problem/13458

package step0;

import java.util.Scanner;

public class step0_13458 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt(); //시험장 개수
		long[] roomArr = new long[testCase]; //시험장
		long cnt = 0; //총 감독관 수
		
		for(int i=0; i<testCase; i++) {
			roomArr[i] = sc.nextInt();
		}
		
		long director1 = sc.nextInt();
		long director2 = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			roomArr[i] = roomArr[i] - director1;
			cnt++;
			if(roomArr[i] >= 0) {
				if(roomArr[i] != 0 && roomArr[i] <= director2) {
					cnt++;
				} else if(roomArr[i] % director2 == 0) {
					cnt += roomArr[i] / director2;
				} else {
					cnt += roomArr[i] / director2 + 1;
				}
			}
		}
		
		System.out.println(cnt);

	}

}
