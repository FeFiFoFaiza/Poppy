import java.util.ArrayList;

public class ALStack<Pancake> implements Stack<Pancake>{

    private int _stackSize;
    private ArrayList<Pancake> _stack;

    public ALStack(){
        _stack = new ArrayList<Pancake>();
        _stackSize = 0;
    }

    @Override
    public boolean isEmpty() {
        return _stackSize == 0;
    }

    @Override
    public Pancake peekTop() {
        return _stack.get(_stackSize - 1);
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
