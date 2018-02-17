//백준저지 알고리즘 5_1_4673

package level5;

import java.util.List;
import java.util.ArrayList;

public class level5_1_4673 {
	
	//함수 d 생성 
	public static int d(int number) {
		int result = 0;
		
		//변수 result에 기존 숫자 number을 더함 
		result += number;
		
		//number의 각 자리 숫자를 result에 더함 
		while(number!=0){
          result += number%10;
          number /= 10;
		}
		
		return result; //result 반환 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();  //동적 배열 생성 
		
		for (int i=1; i<=10000; i++) {
			list.add(d(i)); //셀프넘버가 아닌 숫자들을 동적배열 list에 할당 
		}
		
		for (int i=1; i<=10000; i++) {
			if (!list.contains(i)) { //동적배열 list에 없는 숫자, 즉 셀프넘버일 경우 출력 
				System.out.println(i);
			}
		}
		
	}
	
}
