//https://www.acmicpc.net/problem/10828

package level11;

import java.util.Scanner;

public class level11_1_10828 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		int top = -1;
		int[] itemArray = new int[10000];
		
		for(int i=0; i<testCase; i++) {
			String str = sc.next(); //명령문 입력받음
			switch(str) {
				case "push":
					int item = sc.nextInt();
					itemArray[++top] = item; //삽입
					break;
					
				case "pop":
					if(top == -1) {
						System.out.println(-1);
					} else {
						System.out.println(itemArray[top--]);	
					}
					break;
					
				case "size":
					System.out.println(top+1);
					break;
					
				case "empty":
					if(top == -1) {
						System.out.println(1);
					} else {
						System.out.println(0);
					}
					break;
					
				case "top":
					if(top == -1) {
						System.out.println(-1);
					} else {
						System.out.println(itemArray[top]);
					}
					break;
			}
		}

	}
	
}