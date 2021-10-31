public class endOther{
	
	/*
	Given two strings, return true if either of the strings appears at the very end of the other
  string, ignoring upper/lower case differences (in other words, the computation should not 
  be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
	*/
	
	public boolean endOther(String a, String b) {
    		a = a.toLowerCase();
    		b = b.toLowerCase();
    		int minString = Math.min(a.length(), b.length());
  
    		String aInB = b.substring(b.length()-minString);
    		String bInA = a.substring(a.length()-minString);
  
    		return aInB.equals(bInA);
  	}

	public static void main (String[] args){
		endOther test = new endOther();

		System.out.println(test.endOther("Hiabc", "bc")); // → true
		System.out.println(test.endOther("Hiabcx", "bc")); // → false 
		System.out.println(test.endOther("abc", "abc")); // → true
	}
}
