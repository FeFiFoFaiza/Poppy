import java.util.LinkedList;

public class LLStack<Pancake> implements Stack<Pancake>{

    private int _stackSize;
    private LinkedList<Pancake> _stack;

    public LLStack(){
        _stack = new LinkedList<Pancake>();
        _stackSize = 0;
    }

    @Override
    public boolean isEmpty() {
        return _stackSize == 0;
    }

    @Override
    public Pancake peekTop() {
        return _stack.get(_stackSize);
    }

    @Override
    public Pancake pop() {
        Pancake topDish = peekTop();
        _stack.remove(_stackSize - 1);
        _stackSize--;
        return topDish;
    }

    @Override
    public void push(Pancake x) {
        _stack.add(x);
        _stackSize++;
    }
    
}