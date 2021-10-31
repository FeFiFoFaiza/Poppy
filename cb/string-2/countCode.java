public class countCode{
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

		System.out.println(test.countCode("aaacodebbb"));
	}
}
