import java.util.EmptyStackException;

public class AUS<T> implements MyStack<T> {
    private T[] stack;
    private int top;

    public AUS(int capacity) {
        stack = (T[]) new Object[capacity];
        top = -1;
    }

    public int getCount() {
        return top + 1;
    }

    public boolean isEmpty() {
        return getCount() == 0;
    }

    public void push(T item) {
        if (getCount() < stack.length) {
            stack[++top] = item;
        } else {
            throw new IllegalStateException("Stack is full.");
        }
    }

    public T pop() {
        if (!isEmpty()) {
            return stack[top--];
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
        top = -1;
    }
}
