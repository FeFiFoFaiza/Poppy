/***
 * interface Stack
 * Specifies actions a stack must be able to perform.
 * Allows for generic typing.
 **/

public interface Stack<Pancake>
{
    //Return true if this stack is empty, otherwise false.
    public boolean isEmpty();

    //Return top element of stack without popping it.
    public Pancake peekTop();

    //Pop and return top element of stack.
    public Pancake pop();

    //Push an element onto top of this stack.
    public void push( Pancake x );

}//end interface
