

import java.util.Calendar;

public class TestCalendar{
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		c.set(2019,8,16,10,57);
		long day1 = c.getTimeInMillis();
		day1 += 1000 * 60 * 60;
		c.setTimeInMillis(day1);
		System.out.println("new hour " + c.get(c.HOUR_OF_DAY));
		c.add(c.DATE, 5);
		System.out.println("add 5 days " + c.getTime());
		c.roll(c.DATE, 10);
		System.out.println("roll 10 days " + c.getTime());
		c.set(c.DATE, 1);
		System.out.println("set to 1 " + c.getTime());
	}

}