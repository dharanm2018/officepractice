package practice;

public class OperatorsPracticeExample {
	static int v=0;
	
	public void example1() {
		
		int x=10,a=3;
		a = x + a++;
		System.out.println("X="+x);
		System.out.println("A="+a);
		
		
		int i=10,j=3;
		j = i + j/2*3;
		System.out.println("I="+i);
		System.out.println("J="+j);
	}

	public static void example2() {
		
int g=v;
	}
	public static void main(String[] args) {
		OperatorsPracticeExample obj = new OperatorsPracticeExample();
		obj.example1();

	}

}
