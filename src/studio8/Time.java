package studio8;
import java.util.*;
/**
 * @param hour Current hour
 * @param minute Current minute on clock
 * @param is24Hr Using 24hour clock or 12 hour clock
 * 
 */
public class Time {
	private static int hour;
	private static int minute;
	private static boolean is24Hr;
	
	/**
	 * 
	 * @param h hour
	 * @param m minute
	 */
	
	public Time(int h, int m) {
		hour = h;
		minute = m;
	}
	
	public static void main(String[] args) {
		int h = 5;
		int m = 30;		
    }
	public String toString() {
		return hour+":"+minute;
	}
}