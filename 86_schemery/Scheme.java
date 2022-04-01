/***
 * class Scheme
 * Simulates a rudimentary Scheme interpreter
 *
 * ALGORITHM for EVALUATING A SCHEME EXPRESSION:
 *   1. Steal underpants.
 *   2. ...
 *   5. Profit!
 *
 * STACK OF CHOICE: ALStack by Tofr
 * b/c I'm more comfortable with ALs and mines is like kinda the same as his and it doesnt really matter?
 **/

public class Scheme
{

    /***
     * precond:  Assumes expr is a valid Scheme (prefix) expression,
     *           with whitespace separating all operators, parens, and
     *           integer operands.
     * postcond: Returns the simplified value of the expression, as a String
     * eg,
     *           evaluate( "( + 4 3 )" ) -> 7
     *	         evaluate( "( + 4 ( * 2 5 ) 3 )" ) -> 17
     **/
    public static String evaluate( String expr )
    {
      ALStack<String> _stack = new ALStack<String>();
      Stack<String> _parenStack = new ALStack<String>();
      int Ops = 0;

      for(String character : expr.split("\\s+")){
        if (!character.equals(")"))
          _stack.push(character);
        else {
          _stack.push(character);
          while (!(_stack.peekTop().equals("+") || _stack.peekTop().equals("-") || _stack.peekTop().equals("*"))){
            _parenStack.push(_stack.pop());
          }
          //get operation
          if (_stack.peekTop().equals("+"))
            Ops = 1;
          else if(_stack.peekTop().equals("-"))
            Ops = 2;
          else
            Ops = 3;
          //get rid of the ( and operation 
          _stack.pop();
          _stack.pop();
          //add the unpack to the stack
          _stack.push(unload(Ops, _parenStack));
        }
      }
      return _stack.peekTop();
    }//end evaluate()

  /***
   * precond:  Assumes top of input stack is a number.
   * postcond: Performs op on nums until closing paren is seen thru peek().
   *           Returns the result of operating on sequence of operands.
   *           Ops: + is 1, - is 2, * is 3
   **/
  public static String unload( int op, Stack<String> numbers )
  {
    Integer ans = Integer.parseInt(numbers.pop());
    String currentChar = "";
    while (!numbers.isEmpty())
     {
      currentChar = numbers.pop();
      if(isNumber(currentChar))
      {
        if (op == 1)
          ans += Integer.parseInt(currentChar);
        else if (op ==2)
          ans -= Integer.parseInt(currentChar);
        else
          ans *= Integer.parseInt(currentChar);
      }
    }
    return ans.toString();
  }//end unload()


  
  //optional check-to-see-if-its-a-number helper fxn:
  public static boolean isNumber( String s ) {
  try {
  Integer.parseInt(s);
  return true;
  }
  catch( NumberFormatException e ) {
  return false;
  }
  }


  //main method for testing
  public static void main( String[] args )
  {

      String zoo1 = "( + 4 3 )";
      System.out.println(zoo1);
      System.out.println("zoo1 eval'd: " + evaluate(zoo1) );
      //...7

      String zoo2 = "( + 4 ( * 2 5 ) 3 )";
      System.out.println(zoo2);
      System.out.println("zoo2 eval'd: " + evaluate(zoo2) );
      //...17

      String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
      System.out.println(zoo3);
      System.out.println("zoo3 eval'd: " + evaluate(zoo3) );
      //...29

      String zoo4 = "( - 1 2 3 )";
      System.out.println(zoo4);
      System.out.println("zoo4 eval'd: " + evaluate(zoo4) );
      //...-4

  }//main()

}//end class Scheme
