public class xyzThere{

	/**
	Return true if the given string contains an appearance of "xyz" where the xyz is not 
  directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
	**/
	public boolean xyzThere(String str) {
    for (int i = 0; i < str.length() - 2; i++){
      String phrase = str.substring(i, i + 3);
    
      if (phrase.equals("xyz") && (i == 0)) {
        return true;
      }
      if (phrase.equals("xyz") && (str.charAt(i-1) != '.')){
        return true;
     }
    }
    return false;
  }

	public static void main( String[] args){
		xyzThere test = new xyzThere();
	
		System.out.println(test.xyzThere("abc.xyzxyz")); // → true
		System.out.println(test.xyzThere("1.xyz.xyz2.xyz")); // → false	
		System.out.println(test.xyzThere("xyz.abc")); // → true

	} 
}
