package practice;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

import java.util.Set;

public class StringPracticeEx {



	private void reversString() {

		/*String name = "gangadharan";
		StringBuffer str = new StringBuffer(name);
		StringBuffer reverse = str.reverse();
		System.out.println(reverse);*/

		String name = "gangadharan";

		for (int i = name.length()-1; i >=0; i--) {
			System.out.print(name.charAt(i));
		}

	}

	private void lengthOfString() {
		String a = " j a v a ";
		int length = a.length();
		System.out.println(length);
		int indexOf = a.indexOf("j");
		System.out.println(indexOf);

	}

	private void validatingEqualsFromUser() {
		// TODO Auto-generated method stu

		Scanner scan = new Scanner(System.in);
		System.out.println("User Enter String 1");
		String String1 = scan.nextLine();
		System.out.println("User Enter String 2");
		String String2 = scan.nextLine();

		boolean equals = String1.equals(String2);
		if (equals) {
			System.out.println("Equals");

		}
		else {
			System.out.println("Not equals");

		}


	}
	private void replaceVsReplaceAll() {

		String a = "pragathi is my word and pragathi should be well always";

		String replace = a.replace('p', 'P');
		System.out.println(a);
		System.out.println(replace);
		String replaceAll = a.replaceAll("\\s", "  ");
		System.out.println("replace All "+replaceAll);
		String upperCase = a.toUpperCase();
		System.out.println(a);
		System.out.println("upper case "+upperCase);
		System.out.println(a.substring(1,3));
		System.out.println("Starts with value "+a.startsWith("p"));
		boolean empty = a.isEmpty();
		System.out.println(empty);
		String b ="";
		boolean empty2 = b.isEmpty();
		System.out.println(empty2);
		int hashCode = a.hashCode();
		System.out.println(hashCode);
		a.charAt(0);

	}



	private void duplicateWordFromSentence(String sent) {

		String[] split = sent.split(" ");

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < split.length; i++) {

			String str = split[i];
			if (map.containsKey(str)) {
				map.put(str,map.get(str)+1 );

			}

			else {
				map.put(str, 1);

			}

		}

		//		System.out.println(map);

		Set<Entry<String, Integer>> entrySet = map.entrySet();

		for (Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			System.out.println("KeyName "+key+" : "+entry.getValue());

		}



	}
	private void lowerToUpper() {
		// TODO Auto-generated method stub
		String a = "Gangadharan";
		char[] charArray = a.toCharArray();
		int upper=0;
		int lower=0;
		
		for (int i = 0; i < a.length(); i++) {
			
			if (Character.isUpperCase(a.charAt(i))) {
				upper++;
				charArray[i]=Character.toLowerCase(a.charAt(i));
				
				
				
			} else {
				lower++;
				charArray[i]=Character.toUpperCase(a.charAt(i));
				
			}
			
		}
System.out.println("Upper "+upper+"   "+"lower "+lower);
System.out.println(charArray);

	}

	public static void main(String[] args) {

		StringPracticeEx obj = new StringPracticeEx();
		//		obj.reversString();
		//		obj.duplicateWordFromSentence("bread jam jam bread");
		//		obj.replaceVsReplaceAll();
		//		obj.lengthOfString();
		//		obj.validatingEqualsFromUser();
		obj.lowerToUpper();
	}

}
