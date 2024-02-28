package practice;

public class InterfaceExample {

	interface A {
		
		public abstract void aM1();
		public abstract void aM2();
		
	}
	
	
	interface B extends A {
		
		public void bM1();
		public void bM2();
		
	}
	
	public class Demo implements B {

		public void aM1() {
			// TODO Auto-generated method stub
			
		}

		public void aM2() {
			// TODO Auto-generated method stub
			
		}

		public void bM1() {
			// TODO Auto-generated method stub
			
		}

		public void bM2() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
}
