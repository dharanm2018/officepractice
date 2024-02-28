package practice;

public class Javaprogrammeex {

	public static void main(String[] args) {
		String ref = "ganga19$% dharan ganga";
		int indexOf = ref.indexOf('d');
		
		String replace = ref.replaceAll("\\d", "s");
		System.out.println(indexOf);
//		for (int i = 0; i < ref.length(); i++) {
//			boolean numeric = Character.isDigit(ref.charAt(i));
//			if (numeric) {
//				System.out.println(ref.charAt(i)+"it's numeric");
//				
//			}
//			else {
//				System.out.println(ref.charAt(i)+"it's alpha");
//			}
//			
		
		
		
		
		
		
//			StringBuffer numeric = new StringBuffer(ref);
//			StringBuffer alpha = new StringBuffer(ref);
//			StringBuffer special = new StringBuffer(ref);
//			for (int i = 0; i < ref.length(); i++) {
//				if (Character.isDigit(ref.charAt(i))) {
//					numeric.append(ref.charAt(i));
//				}
//				else if (Character.isAlphabetic(ref.charAt(i))) {
//					alpha.append(ref.charAt(i));
//				}
//				else {
//					special.append(ref.charAt(i));
//				}
//				System.out.println(numeric);
//				System.out.println(alpha);
//				System.out.println(special);
//				
//			}
			
		}

	}


