//백준저지 알고리즘 5_1_4673
//please check

package level5;

import java.util.*;

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
		
		//위의 while부분을 아래와 같이 짜도 무방함.
//		String numStr = String.valueOf(number);
//		
//		for (int i=0; i<numStr.length(); i++) {
//			result += Integer.parseInt(numStr.substring(i, i+1));
//		}
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
		
		
		
//		int sum = 0;
//		boolean[] arr = new boolean[100];
//	    
//	    for(int i=0; i<=arr.length; i++) {
//	    		int num = i;
//	    		
//	    		//원래의 숫자를 더해서 sum에 저장 
//    			sum += num;
//	    		
//	    		//각 자리의 숫자를 더해서 sum에 저장 
//	    		while(num!=0){
//                //num을 10으로 나눈 나머지를 sum에 더한다.
//                sum += num%10;
//                //num을 10으로 나눈 값을 다시 num에 저장한다.
//                num /= 10;
//            }
//	    		
//	    		while(num!=0) {
//	    			sum += num%10;
//	    			num = num/10;
//	    		}
//	    		
//	    		if(sum <= 100) {
//	    			arr[sum] = true;
//	    		} else {
//	    			break;
//	    		}
//	    }
//	    
//	    for(int i=0; i<=arr.length; i++) {
//	    		if(arr[i]==false) {
//	    			System.out.println(i);
//	    		}
//	    		System.out.println(i + " " + arr[i]);
//	    }

	}
	
}
