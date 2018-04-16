package level15;

import java.util.Scanner;

public class level15_5_1676_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		 
        int num = sc.nextInt();
        int result = 1;
        int cnt = 0;
        
        for (int i = 1; i <= num; i++) {
            result = i;
 
            while (result % 5 == 0) {
            	result /= 5;
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }

}