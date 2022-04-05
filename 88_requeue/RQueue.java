/***
 * class RQueue
 * SKELETON
 * A node-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linkages point opposite direction for O(1) en/dequeuing
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 **/


public class RQueue<SWASHBUCKLE> implements Queue<SWASHBUCKLE>
{
  //instance variables
  private LLNode<SWASHBUCKLE> _front, _end;
  private int _size;


  // default constructor creates an empty queue
  public RQueue()
  {
    _end = _front = null;
    _size = 0;
  }


  public void enqueue( SWASHBUCKLE enQVal )
  {
    LLNode<SWASHBUCKLE> tmp = new LLNode<SWASHBUCKLE>(enQVal, null);
    if (_size == 0){
      _front = _end = tmp;
    }
    else{
      _end.setNext(tmp);
      _end = tmp;
    }
    _size++;
  }//O(1)


  // remove and return thing at front of queue
  // assume _queue ! empty
  public SWASHBUCKLE dequeue()
  {
    sample();
    LLNode<SWASHBUCKLE> tmp = _front;
    _front = _front.getNext();
    _size--;
    return tmp.getCargo();
  }//O(1)


  public SWASHBUCKLE peekFront()
  {
    return _front.getCargo();
  }//O(1)


  /***
   * void sample() -- a means of "shuffling" the queue
   * Algo:
   *   Switch a rand node with the front node
   **/
  public void sample ()
  {
    LLNode<SWASHBUCKLE> _tmp = _front;
    int random = (int) (Math.random() * _size);
    for (int i = 0; i < random; i++) {
      _tmp = _tmp.getNext();
    }
    SWASHBUCKLE tmpCargo = _front.getCargo();
    _front.setCargo(_tmp.getCargo());
    _tmp.setCargo(tmpCargo);
  }//O(n)


  public boolean isEmpty()
  {
    return _front == null;
  } //O(1)


  // print each node, separated by spaces
  public String toString()
  {
    String line = "";
    LLNode<SWASHBUCKLE> tmp = _front;
    while ( tmp != null ) {
      line += tmp.getCargo() + " ";
      tmp = tmp.getNext();
    }
    return line;
  }//end toString()



  //main method for testing
  public static void main( String[] args )
  {
    
    Queue<String> PirateQueue = new RQueue<String>();

    System.out.println("\nnow enqueuing..."); 
    PirateQueue.enqueue("Dread");
    PirateQueue.enqueue("Pirate");
    PirateQueue.enqueue("Roberts");
    PirateQueue.enqueue("Blackbeard");
    PirateQueue.enqueue("Peter");
    PirateQueue.enqueue("Stuyvesant");

    System.out.println("\nnow testing toString()..."); 
    System.out.println( PirateQueue ); //for testing toString()...

    System.out.println("\nnow dequeuing..."); 
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );

    System.out.println("\nnow dequeuing fr empty queue...\n" +
                       "(expect NPE)\n"); 
    System.out.println( PirateQueue.dequeue() );

    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
    ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main

}//end class RQueue