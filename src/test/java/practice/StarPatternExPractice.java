package practice;

public class StarPatternExPractice {


	private void pattern1() {

		//	*
		//	**
		//	***
		//	****
		//	*****

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <=i ; j++) {

				System.out.print("*");

			}
			System.out.println();
		}

	}


	private void pattern2() {

		//	*****
		//	****
		//	***
		//	**
		//	*

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <5-i ; j++) {

				System.out.print("*");

			}
			System.out.println();
		}

	}
	
	private void pattern3(int n)
	
    {
        int i, j;
        // outer loop to handle rows
        for (i = 0; i < n; i++) {
            // inner loop to print spaces.
            for (j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
 
            // inner loop to print stars.
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
 
            // printing new line for each row
            System.out.println();
        }
    }
 
	
	
	public static void main(String[] args) {
		StarPatternExPractice obj = new StarPatternExPractice();
		obj.pattern3(5);

	}

}
