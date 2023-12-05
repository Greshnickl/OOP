import java.util.EmptyStackException;

public class ADS<T> implements MyStack<T> {
    private T[] stack;
    private int top;

    public ADS(int capacity) {
        stack = (T[]) new Object[capacity];
        top = capacity;
    }

    public int getCount() {
        return stack.length - top;
    }

    public boolean isEmpty() {
        return getCount() == 0;
    }

    public void push(T item) {
        if (top > 0) {
            stack[--top] = item;
        } else {
            throw new IllegalStateException("Stack is full.");
        }
    }

    public T pop() {
        if (!isEmpty()) {
            return stack[top++];
        }
        throw new EmptyStackException();
    }

    public T peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        throw new EmptyStackException();
    }

    public void clear() {
        System.out.println("Cleared!\n");
        top = stack.length;
    }
}
