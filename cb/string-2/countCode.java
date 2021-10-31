public class countCode{
	
	/*
	Return the number of times that the string "code" appears anywhere in the given string, 
	except we'll accept any letter for the 'd', so "cope" and "cooe" count.
	*/
	
	public int countCode(String str) {
 	int codeCtr = 0;
  	for (int i = 2; i < str.length() - 1; i++){
    		String frontPhrase = str.substring(i-2, i);
		char nextLetter = str.charAt(i+1);
		if (frontPhrase.equals("co") && nextLetter == 'e') {
			codeCtr++;
		}
	}
  	return codeCtr;
	}

	public static void main (String[] args){
		countCode test = new countCode();

		System.out.println(test.countCode("aaacodebbb")); // → 1
		System.out.println(test.countCode("AAcodeBBcoleCCccorfDD")); // → 2
		System.out.println(test.countCode("ode")); // → 0
	}
}
