public class LLNode<SWASHBUCKLE>
{
  //instance vars
  private SWASHBUCKLE _cargo;
  private LLNode<SWASHBUCKLE> _nextNode;

  // constructor
  public LLNode( SWASHBUCKLE value, LLNode<SWASHBUCKLE> next )
  {
    _cargo = value;
    _nextNode = next;
  }


  //--------------v  ACCESSORS  v--------------
  public SWASHBUCKLE getCargo()
  {
    return _cargo;
  }

  public LLNode<SWASHBUCKLE> getNext()
  {
    return _nextNode;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public SWASHBUCKLE setCargo( SWASHBUCKLE newCargo )
  {
    SWASHBUCKLE foo = getCargo();
    _cargo = newCargo;
    return foo;
  }

  public LLNode<SWASHBUCKLE> setNext( LLNode<SWASHBUCKLE> newNext )
  {
    LLNode<SWASHBUCKLE> foo = getNext();
    _nextNode = newNext;
    return foo;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString()
  {
    return _cargo.toString();
  }


  //main method for testing
  public static void main( String[] args )
  {
    /**
    //Below is an exercise in creating a linked list...

    //Create a node
    LLNode first = new LLNode( "cat", null );

    //Create a new node after the first
    first.setNext( new LLNode( "dog", null ) );

    //Create a third node after the second
    first.getNext().setNext( new LLNode( "cow", null ) );

    /* A naive list traversal, has side effects.... ??
       while( first != null ) {
         System.out.println( first );
         first = first.getNext();
       }
    */

    //Q: when head ptr moves to next node in list, what happens to the node it just left?
    //A: garbage collector reclaims that memory

    //  so, better: (w/o moving first)
    /*
      LLNode temp = first;
      while( temp != null ) {
        System.out.println( temp );
        temp = temp.getNext();
      }
    */

  }//end main

}//end class LLNode
