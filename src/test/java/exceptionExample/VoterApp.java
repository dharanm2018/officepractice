package exceptionExample;

public class VoterApp extends CustomInvalidAgeException {

	public void validateAge(int age) throws CustomInvalidAgeException {

		if (age<18) {
			throw new CustomInvalidAgeException("Age is below 18");
		}
		else {
			System.out.println("invalid age");
		}



	}



	public static void main(String[] args) throws CustomInvalidAgeException {
		VoterApp obj = new VoterApp();
		try {
			obj.validateAge(19);
		} catch (CustomInvalidAgeException e) {
			System.out.println(e.getMessage());
		}

System.out.println("Election preparation done");


	}

}
