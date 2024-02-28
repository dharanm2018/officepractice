package wrapper;

import java.util.Iterator;

public class WrapperClassExample {
	
	private void method1() {
		int x = 90;
		Integer valueOf = Integer.valueOf(x);
		String string = "20";
		Integer valueOf2 = Integer.valueOf(string);
		System.out.println(valueOf2);
		
		Integer ab = x;
		
		int intValue = valueOf.intValue();
		
		int aub=valueOf;
		
		int parseInt = Integer.parseInt(string);
		
		float value = 44.3f;
		
		Float valueOf3 = Float.valueOf(string);
		
		Double valueOf4 = Double.valueOf(string);
		
		
		double doubleValue = valueOf4.doubleValue();
		
		double value5=valueOf4;

	}

	public static void main(String[] args) {


		int[] a = {1,2,3,4,5,6};
		
		int [][] b = new int[2][3];

System.out.println(a[0]);

		
		for (int i = 0; i < 2; i++) {
			
			int c=0;
			
			for (int j = 0; j <2; j++) {
				
				

				while (c>2) {
					b[i][j]=a[j];
					c++;
					
				}
				System.out.print(b[i][j]+" | ");
			}
					
		}
		
		
		}
		
		

	}


