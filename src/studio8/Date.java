package studio8;
/**
 * @param month Given month
 * @param day Given day
 * @param year Given year
 * 
 */
public class Date {
	private static int month;
	private static int day;
	private static int year;
	private static boolean isHoliday;
	
	/**
	 * 
	 * @param m month
	 * @param d day
	 * @param y year
	 * @param H isHoliday
	 */
	
public Date(int m, int d, int y, boolean H) {
	month = m;
	day = d;
	year = y;
	isHoliday=H;
}
    public static void main(String[] args) {
   	}
    public String toString() {
    	return month+"/"+day+"/"+year;
    }
}
