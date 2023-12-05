import java.util.LinkedList;
import java.util.NoSuchElementException;

public class SLL<T> implements MyStack<T> {
    private LinkedList<T> stack;

    public SLL() {
        stack = new LinkedList<>();
    }

    public int getCount() {
        return stack.size();
    }

    public boolean isEmpty() {
        return getCount() == 0;
    }

    public void push(T item) {
        stack.addLast(item);
    }

    public T pop() {
        if (!isEmpty()) {
            T item = stack.getLast();
            stack.removeLast();
            return item;
        }
        throw new NoSuchElementException("Stack is empty.");
    }

    public T peek() {
        if (!isEmpty()) {
            return stack.getLast();
        }
        throw new NoSuchElementException("Stack is empty.");
    }

    public void clear() {
        System.out.println("Cleared!\n");
        stack.clear();
    }
}
