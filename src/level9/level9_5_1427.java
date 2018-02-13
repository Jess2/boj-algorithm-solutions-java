//BOJ level9_5_1427
//성공

package level9;

import java.util.Scanner;

public class level9_5_1427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char[] arr = input.toCharArray();
		
		insertionSort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}

	}
	
	//삽입 정렬 
	public static char[] insertionSort(char[] arr) {
		for(int i=1; i<arr.length; i++) {
			char temp = arr[i];
			int aux = i-1;
			
			while(aux>=0 && arr[aux] < temp) {
				arr[aux+1] = arr[aux];
				aux--;
			}
			arr[aux+1] = temp;
		}
		
		return arr;
	}

}
