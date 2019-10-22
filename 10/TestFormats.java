
import java.util.Date;

public class TestFormats {
	public static void main(String[] args) {
		Date today = new Date();
		String s = String.format("%tA, %<tB, %<td", today);
		System.out.println(s);
	
	}

}