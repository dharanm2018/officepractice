package practice;

class Test {
	
	int a = 10;
	static int b=10;
	
	public void method1() {
		
		b=11;
		a=11;
		
		System.out.println(a+" "+b);
	}

	
	private void method2() {
		//System.out.println("4>5"+ "4<5");
		//System.out.println(5+ 4);
		//System.out.println("4>5"+ (4<5));
		//
		//System.out.println(4<5 ? "Ganga":"dharan");

	}
	
	private void method3() {
		a=12;
		
		System.out.println(a+" "+b);

	}
	
	private void method4() {
		a=15;
		
		System.out.println(a+" "+b);
		b=19;
		b=20;
		

	}
	public static void main(String[] args) {
		Test obj = new Test();
		obj.method1();
		obj.method3();
		obj.method4();
		System.out.println(b);
		


		

	}

}