//백준저지 알고리즘 level2_8_2839
//check please

package level2;

import java.util.*;

public class level2_8_2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 키로를 배달해야 합니까? ");
		int num = sc.nextInt();
		int result = 0;
		
		if((num%5)%3 == 0) {
			result += num/5;
			result += (num%5)/3;
		}
		
		else if((num%5)%3 != 0 && num%3==0) {
			result = num/3;
		}
		
		else {
			result = -1;
		}

		System.out.println(result);

	}

}
