import java.util.EmptyStackException;

public class ADQ<T> implements MyQueue<T> {
    private T[] queue;
    private int front;
    private int back;

    public ADQ(int capacity) {
        queue = (T[]) new Object[capacity];
        front = -1;
        back = 0;
    }

    public int getCount() {
        return back - front - 1;
    }

    public boolean isEmpty() {
        return getCount() == 0;
    }

    public void enqueue(T item) {
        if (back < queue.length) {
            queue[back++] = item;
        } else {
            throw new IllegalStateException("Queue is full.");
        }
    }

    public T dequeue() {
        if (!isEmpty()) {
            return queue[++front];
        }
        throw new EmptyStackException();
    }

    public T peek() {
        if (!isEmpty()) {
            return queue[front + 1];
        }
        throw new EmptyStackException();
    }

    public void clear() {
        front = -1;
        back = 0;
    }
}
