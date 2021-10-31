public class doubleChar{

	/**
	Given a string, return a string where for every char in the original, there are two chars.
	**/
	public String doubleChar(String str) {
 		String result = "";
  		for(int i = 0; i < str.length(); i++){
   			result += str.charAt(i);
    			result += str.charAt(i);
  		}
  		return result;
	}

	public static void main( String[] args){
		doubleChar test = new doubleChar();
		
		// doubleChar tests
		System.out.println("doubleChar tests:");
		System.out.println(test.doubleChar("Hi-There")); // → "HHii--TThheerree"
		System.out.println(test.doubleChar("Word!")); // → "WWoorrdd!!"
		System.out.println(test.doubleChar("")); // → ""

	} 
}

