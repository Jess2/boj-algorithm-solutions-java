//BOJ level9_6_1181
//성공
//check please, 다른 풀이법 궁금 

package level9;

import java.util.Arrays;
import java.util.Scanner;

public class level9_6_1181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt(); //단어의 개수 입력받아 저장
		
		String[] arr = new String[size];
		for(int i=0; i<size; i++) {
			arr[i] = sc.next();
		}
		
		Arrays.sort(arr);
		
		String[] temp = new String[size];
		
		int k=0;
		
		for(int i=1; i<=50; i++) {
			for(int j=0; j<size; j++) {
				if(arr[j].length() == i && Arrays.asList(temp).contains(arr[j])==false) {
					System.out.println(arr[j]);
					temp[k++] = arr[j];
				}
			}
		}
		
	}

}
