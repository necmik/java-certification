package java11.enumerations;

public class WeekDaysTest {

	public static void main(String[] args) {
		for (WeekDays day : WeekDays.values()) {
			System.out.println(day.ordinal() + " is " + day.abbrevation + ": " + day.description);
		}
	}
}
