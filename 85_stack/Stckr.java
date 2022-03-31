/***
 * class Stckr
 * SKELETON
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 **/

public class Stckr
{
  public static void main( String[] args )
  {

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // USAGE: un-comment exactly 1 assignment below
    Stack<Object> cakes = new ALStack<Object>();
    //Stack<Z> cakes = new LLStack<Z>();
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    System.out.println(cakes.isEmpty());
    cakes.push("BOOOOOOO");
    cakes.push(1245);
    System.out.println(cakes.isEmpty());
    System.out.println(cakes.peekTop());
    cakes.pop();
    System.out.println(cakes.peekTop());
    //...

  }//end main

}//end class
