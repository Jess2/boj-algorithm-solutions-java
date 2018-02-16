//오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.

package level3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class level3_8 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		
		int month = scanner.nextInt(); //월 입력받음
		int day = scanner.nextInt(); //일 입력받음
		
		String m = "";
		String d = "";
		
		if(month<10) {
			m = "0" + month;
		} else {
			m += month;
		}
		
		if(day<10) {
			d = "0" + day;
		} else {
			d += day;
		}
		
		Date date = formatter.parse("2007"+m+d);  // 날짜 입력하는곳 .
		date = new Date(date.getTime() + (1000*60*60*24*+0));
		
		Calendar cal = Calendar.getInstance() ;
		cal.setTime(date);              // Calendar에 넣는다.
		
		int dayNum = cal.get(Calendar.DAY_OF_WEEK);   // 요일을 구해온다. 
		
		String convertedString = "";
		
		switch (dayNum) {
		    case 1: convertedString = "SUN"; break;
		    case 2: convertedString = "MON"; break;
		    case 3: convertedString = "TUE"; break;
		    case 4: convertedString = "WED"; break;
		    case 5: convertedString = "THU"; break;
		    case 6: convertedString = "FRI"; break;
		    case 7: convertedString = "SAT"; break;
		}

		System.out.println(convertedString);

	}

}



