/***
 * class LatKtS
 * SKELETON
 * driver class for Latkes
 * Uses a stack to reverse a text string, check for sets of matching parens.
 **/

public class LatKtS
{

  private static Latkes potato;

  /***
   * precondition:  input string has length > 0
   * postcondition: returns reversed string s
   *                flip("desserts") -> "stressed"
   **/
  public static String flip( String s )
  {
	potato = new Latkes(10);
	String ans = "";

	for (String chr : s.split("")) {
		potato.push(chr);
	}

	int size = potato.getSize();

	for(int i = 0; i < size; i++) {
		ans += potato.pop();
	}
	return ans;
  }


  /***
   * precondition:  s contains only the characters {,},(,),[,]
   * postcondition: allMatched( "({}[()])" )    -> true
   *                allMatched( "([)]" )        -> false
   *                allMatched( "" )            -> true
   **/


  public static boolean allMatched( String s )
  {
	potato = new Latkes(10);
	
	for (String chr : s.split("")) {
		if (chr.equals("(") || chr.equals("[") || chr.equals("{"))
			potato.push(chr);
		else
			if (!(chr.equals("(") && potato.pop().equals(")")) || !(chr.equals("{") && potato.pop().equals("}")) || !(chr.equals("[") && potato.pop().equals("]")))
				return false;
	}
	return true;
  }


  //means of insertion


  //main method to test
  public static void main( String[] args )
  {
    //v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
    System.out.println(flip("stressed"));
    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
  }

}//end class
