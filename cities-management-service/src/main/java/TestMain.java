
/*
 * 
 */
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// TODO: Auto-generated Javadoc
/**
 * The Class TestMain.
 */
public class TestMain {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder builder = new StringBuilder("2018-01-29 ");
		builder.append("13:30");

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime localStartDateTime = LocalDateTime.parse(builder.toString(), formatter);

		StringBuilder builder2 = new StringBuilder("2018-01-29 ");
		builder2.append("10:00");

		LocalDateTime localArrivalDateTime = LocalDateTime.parse(builder2.toString(), formatter);

		Duration duration = Duration.between(localStartDateTime, localArrivalDateTime);

		System.out.println("Duration: " + duration.toMinutes());

		/*
		 * 
		 * String str = "2018-01-29 01:30"; DateTimeFormatter formatter1 =
		 * DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"); LocalDateTime dateTime =
		 * LocalDateTime.parse(str, formatter1); System.out.println("datetime: " +
		 * dateTime);
		 * 
		 * StringBuilder builder = new StringBuilder("2018-01-29 ");
		 * builder.append("13:00");
		 * 
		 * 
		 * 
		 * DateTimeFormatter formatter =
		 * DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		 * 
		 * LocalDateTime localDateTime = LocalDateTime.parse(builder.toString(),
		 * formatter); System.out.println("localdatetime: " + localDateTime);
		 * 
		 * Duration duration = Duration.between(dateTime,localDateTime );
		 * 
		 * 
		 * 
		 * System.out.println("Duration: " + duration.toMinutes());
		 */

	}

}
