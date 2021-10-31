public class makeAbba {
	
	/**
	Given two strings, a and b, return the result of putting them together in the order abba,
	e.g. "Hi" and "Bye" returns "HiByeByeHi".
	**/
	public String makeAbba(String a, String b) {
		return a + b + b + a;
	}

	public static void main( String[] args){
		makeAbba test = new makeAbba();
		
		// Tests for makeAbba
		System.out.println("makeAbba tests:");
		System.out.println(test.makeAbba("Hi", "Bye")); // → "HiByeByeHi"
                System.out.println(test.makeAbba("x", "")); // → "xx"
                System.out.println(test.makeAbba("", "y")); // → "yy"
	}



}
