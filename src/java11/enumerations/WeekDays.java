package java11.enumerations;

public enum WeekDays {
	
	SUNDAY("Sun", "Wonderful Weekend"),
	MONDAY("Mon", "Long road ahead"),
	TUESDAY("Tues", "Long road ahead"),
	WEDNESDAY("Wed", "Hump day"),
	THURSDAY("Thurs", "TGIF - 1"),
	FRIDAY("Fri"),
	SATURDAY("Sat", "Wonderful Weekend");
	
	String abbrevation;
	String description = "TGIF";
	
	WeekDays(String abbrevation) {
		this.abbrevation = abbrevation;
	}
	
	WeekDays(String abbrevation, String description) {
		this.abbrevation = abbrevation;
		this.description = description;
	}

}
