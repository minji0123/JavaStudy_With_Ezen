package dateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeRun {
	public static void main(String[] args) {
		Date now = new Date();
		
		System.out.println(now);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s1 = sdf1.format(now);
		System.out.println(s1);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초 S밀리초");
		String s2 = sdf2.format(now);
		System.out.println(s2);
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초 S밀리초 E요일");
		String s3 = sdf3.format(now);
		System.out.println(s3);
	}

}
