package encapsulationexample;

public class EncapsulationExPractice {
	
	private int a =0;
	private int b=0;
	
	
	public EncapsulationExPractice() 
	{

	}
	
	public EncapsulationExPractice(int a, int b) 
	{
this.a=a;
this.b=b;
	}
	
	
	
	public int getA() {
		System.out.println(a);
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		System.out.println(b);
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	

	

}
