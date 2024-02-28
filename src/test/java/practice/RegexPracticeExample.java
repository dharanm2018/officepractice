package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPracticeExample {

	public boolean isValidEmail(String email) {
		//		String regex="\\w+[.][a-zA-Z_0-9]+[@][a-zA-Z_0-9]+[.][a-z]{2,3}$";

		String regex="\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";
		if (email.matches(regex)) {
			System.out.println("valid email id");
			return true;
		} else {
			System.out.println("not valid emaild id");
			return false;
		}

	}

	
	public boolean isValidMobile(String mobile) {
		//		String regex="\\w+[.][a-zA-Z_0-9]+[@][a-zA-Z_0-9]+[.][a-z]{2,3}$";

		String regex="\\d{10}";
		if (mobile.matches(regex)) {
			System.out.println("valid mobile NUMBER");
			return true;
		} else {
			System.out.println("not valid mobile NUMBER");
			return false;
		}

	}

	public int calculateSumOfDigit(String value) {

		int sum=0;
		String regex ="\\d";
		Pattern compile = Pattern.compile(regex);
		Matcher matcher = compile.matcher(value);

		while (matcher.find()) {
			sum+=Integer.parseInt(matcher.group());

		}
		System.out.println(sum);
		return sum;

	}



	public static void main(String[] args) {
		RegexPracticeExample obj = new RegexPracticeExample();
		obj.isValidEmail("dharanm2008@gmail.com");
		obj.isValidMobile("9884565309");
		obj.calculateSumOfDigit("as23ad56sfdds");




	}

}
