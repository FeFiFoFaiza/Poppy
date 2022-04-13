/**
THE SPANISH INQUISITION | Sra. Faiza Huda, Sr. Truthful Tom, Sr. Huebert, Sr. Prattey Dey, Sr. Joshua Gao
apcs
HW89 -- Queue Two Ways
2022-04-12
time spent: 0.5hr

DISCOS
- We did do smth similar- at least for Linked List Queue -> NodeQueue

QCC
- What decides which API to use?
- Since we already did something similar, what's the use of doing it again?
**/

public class LLQueue<QUASAR> implements Queue<QUASAR>
{

	private LLNode<QUASAR> _front, _back;
	private int _size;

	public LLQueue() {
		_front = _back = null;
		_size = 0;
	}

	public QUASAR dequeue() {
		QUASAR retVal = _front.getCargo();
		_front = _front.getNext();

		if ( _front == null )
			_back = null;

		_size--;
		return retVal;
	}

	public void enqueue( QUASAR x ) {
		LLNode<QUASAR> tmp = new LLNode<QUASAR>( x , null );
		if ( isEmpty() ) {
			_front = _back = tmp;
		} else {
			_back.setNext( tmp );
			_back = _back.getNext();
		}
		_size++;
	}

	public boolean isEmpty() { return _size == 0; }

	public QUASAR peekFront() { return _front.getCargo(); }

	private class LLNode<T>
  	{
    		//instance vars
    		private T _cargo;    //cargo may only be of type T
		private LLNode<T> _nextNode; //pointer to next LLNode<T>

    		// constructor -- initializes instance vars
    		public LLNode( T value, LLNode<T> next ) {
     	 		_cargo = value;
      			_nextNode = next;
    		}


		//--------------v  ACCESSORS  v--------------
    		public T getCargo() { return _cargo; }

		public LLNode<T> getNext() { return _nextNode; }
    		//--------------^  ACCESSORS  ^--------------

	
    		//--------------v  MUTATORS  v--------------
    		public T setCargo( T newCargo ) {
      			T foo = getCargo();
      			_cargo = newCargo;
      			return foo;
    		}

    		public LLNode<T> setNext( LLNode<T> newNext ) {
      			LLNode<T> foo = getNext();
      			_nextNode = newNext;
      			return foo;
    		}
    		//--------------^  MUTATORS  ^--------------


    		// override inherited toString
    		public String toString() { return _cargo.toString(); }

  		}//end class LLNode

}


