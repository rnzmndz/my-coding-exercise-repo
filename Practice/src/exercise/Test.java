package exercise;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test {
	public static void main(String[] args) throws Exception {
		Calendar c = new GregorianCalendar();
		c.set(1998,28);
		System.out.print(c.get(0));
		
		}
}