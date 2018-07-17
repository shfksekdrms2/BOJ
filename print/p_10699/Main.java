package backjoon.BOJ.print.p_10699;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
 * https://www.acmicpc.net/problem/10699
 * 오늘 날짜 
 */
public class Main {
	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
		Date currentTime = new Date();
		String time = simpleDateFormat.format(currentTime);
		System.out.println(time);
	}
}
