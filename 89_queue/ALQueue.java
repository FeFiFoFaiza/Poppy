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

import java.util.ArrayList;

public class ALQueue<QUASAR> implements Queue<QUASAR>
{
	private ArrayList<QUASAR> _stack;

	public ALQueue()
	{
		_stack = new ArrayList<QUASAR>();
	}

	public QUASAR dequeue()
	{
		QUASAR retVal = null;
		if ( !isEmpty() )
			retVal = _stack.remove(0);
		return retVal;
	}

	public void enqueue( QUASAR x )
	{
		_stack.add(x);
	}

	public boolean isEmpty() { return _stack.size() == 0; }

	public QUASAR peekFront()
	{
		QUASAR retVal = null;
		if ( !isEmpty() )
			retVal = _stack.get(0);
		return retVal;
	}
}
