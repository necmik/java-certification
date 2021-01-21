package java11.enumerations;

public enum DaysOfTheWeek {

	sunday, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class TestDaysOfTheWeek {
	public static void main(String[] args) {
		for (DaysOfTheWeek day : DaysOfTheWeek.values()) {
			System.out.println(day.ordinal() + " is " + day);
		}
	}
}
