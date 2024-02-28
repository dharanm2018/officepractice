package practice;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DatePracticeExample {

	private void timeExample() {
		Instant now = Instant.now();
		System.out.println(now);
		LocalDate examDate = LocalDate.now();
		System.out.println("Exam Date " + examDate);
		LocalDate nextExamDate = LocalDate.of(2024, 2, 17);
		System.out.println("Next Exam Date " + nextExamDate);
		Period until = examDate.until(nextExamDate);
		System.out.println("Days for Next exam date " + until);
		System.out.println("Days for Next exam date " + until.getDays());
		// System.out.println("Days for Next exam date "+until.get(ChronoUnit.DAYS));
		LocalDate minusMonths = examDate.minusMonths(1);
		System.out.println("Exam date minus one month : " + minusMonths);

		// move to 30th day of month
		LocalDate withDayOfMonth = examDate.withDayOfMonth(19);
		System.out.println("Exam Date with day of month : " + withDayOfMonth);

		ZonedDateTime now2 = ZonedDateTime.now();
		System.out.println("Zoned Dat : " + now2);

		// Date and Time format
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		String format2 = examDate.format(format);
		System.out.println("Foramted Exam Date : " + format2);

		ZonedDateTime now3 = ZonedDateTime.now(ZoneId.of("Australia/Darwin"));
		System.out.println("Newly set Zone :  " + now3);

		
		 DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		 String s = "10/05/2000"; 
		 LocalDate parse = LocalDate.parse(s, formater);
		 System.out.println("USING parse : format is : "+ parse);
		 
		
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String s1="10/05/2000";
		LocalDate d1 =LocalDate.parse(s, f1);
		System.out.println("Date in specified pattern is : " + d1);

	}

	public static void main(String[] args) {

		DatePracticeExample obj = new DatePracticeExample();
		obj.timeExample();
	}

}
