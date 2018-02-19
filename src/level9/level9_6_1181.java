//BOJ level9_6_1181

package level9;

import java.util.Arrays;
import java.util.Scanner;

public class level9_6_1181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt(); //단어의 개수 입력받아 저장
		
		String[] arr = new String[size]; //단어의 개수 크기만큼 String형 배열 생성
		for(int i=0; i<size; i++) { //반복문 돌면서 배열에 단어들 입력받아 저장
			arr[i] = sc.next();
		}
		
		Arrays.sort(arr); //배열 정렬
		
		System.out.println("사전 순으로 정렬");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String[] temp = new String[size]; //새로운 String형 배열 생성
		
		int k=0;
		
		System.out.println();
		System.out.println("단어 정렬");
		
		for(int i=1; i<=50; i++) { //한 단어의 길이가 50을 넘지 않으므로 50만큼 반복
			for(int j=0; j<size; j++) { //단어의 개수만큼 반복
				if(arr[j].length() == i && Arrays.asList(temp).contains(arr[j])==false) { //temp 배열에 우리가 입력한 단어가 들어있지 않을 경우 그 단어를 출력
					System.out.println(arr[j]);
					temp[k++] = arr[j]; //temp[k]에 방금 출력한 단어를 저장한 후, k++
				}
			}
		}
		
	}

}

//contains 대신 remove를 사용할 수도 있다.
//ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
//
//for (String s : list) {
//	if (s.equals("a"))
//		list.remove(s);
//}
