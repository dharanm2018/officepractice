package exceptionExample;

public class ExceptionPracticeExample {

	public void getExceptionMessage() {

		int a =1;
		int b=0;
		try {
			int division  = a/b;
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception get Class Method: " +e.getClass());
			String message = e.getMessage();
			System.out.println("Exception Message : " +message);
			System.out.println("Succesffuly Completed in catch Block");
		}
		finally {
			System.out.println("FINALY Task moved to next execution");

		}

	}

	public static void main(String[] args) {

		ExceptionPracticeExample obj = new ExceptionPracticeExample();
		obj.getExceptionMessage();
	}

}
