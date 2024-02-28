package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayPracticeEx {

	private void arrayEx1() {

		int [] array= {1,2,3,4,5,6};
		//		ouput : 
		//		1{0,0},2{0,1}
		//		3{1,0},4{1,1}
		//		5{2,0},6{2,1}
		
		int[][] array2=new int[3][2];
		
		int count=0;
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 2; j++) {
				
				array2[i][j]=array[count];
				count++;
				
				
			}
			
		}
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[0].length; j++) {
				System.out.print(array2[i][j]+" ");
			
				
				
			}
			System.out.println();
			
		}

	}
	
	private void arrayBasic() {

		int a[] = {1,3,4,5};
		int b[] = {1,3,4,6};
		String string = a.toString();
		System.out.println(string);

	}
	
	private void sumOfValue() {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
	int sum = 0;
	
	for (int i : a) {
		
		sum+=i;
		
	}
	System.out.println(sum);
	System.out.println("avg"+sum/a.length);
	}
	
	private void removeDuplicate() {
		// TODO Auto-generated method stub
		
		int a[]= {10,10,20,50,45,55,20,45};
		boolean b[]= new boolean[a.length];
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
			
			for (int j = i+1; j < b.length; j++) {
				
				if (a[i]==a[j]) {
					b[j]=true;
					
			
				
					
				}
				
			}
			
		}
		
		for (int i = 0; i < b.length; i++) {
			
			if (b[i]==true) {
				System.out.println("Duplicate "+a[i]);
				
				
				
			}
			
		}
		Set<Integer> set = new LinkedHashSet<>(list);
		System.out.println(set);
		System.out.println("Size of the list"+list.size());
		System.out.println(list.indexOf(10));
		System.out.println(list.indexOf(20));
		System.out.println(list.get(2));
		
		for (int i = 0; i < list.size(); i++) {
			Integer integer = list.get(i);
			System.out.print(integer+" ");
						
		}
		System.out.println();
		for (Integer integer : list) {
			System.out.print(integer+" ");
			
		}
		System.out.println();
		
		Integer remove = list.remove(2);
		System.out.println("removing index"+remove);
		String string = list.toString();
		System.out.println(string);
		System.out.println("removing the value"+list.remove(list.indexOf(10)));
		System.out.println(list);
		System.out.println("removing the last value"+list.remove(list.lastIndexOf(45)));
		System.out.println(list);
	}
	
	

	public static void main(String[] args) {
ArrayPracticeEx obj = new ArrayPracticeEx();
obj.removeDuplicate();


	}

}
