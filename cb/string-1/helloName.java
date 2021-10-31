public class helloName {
	
	/**
	Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
        **/
	public String helloName(String name) {
 		return "Hello " + name + "!";
	}

	public static void main( String[] args){
		helloName test = new helloName();
		
		// Tests for helloName
		System.out.println("helloName tests:");
		System.out.println(test.helloName("Bob")); // → "Hello Bob!"
		System.out.println(test.helloName("Alice")); // → "Hello Alice!"
		System.out.println(test.helloName("ho ho ho")); // → "Hello ho ho ho!"
	}



}
