import java.util.EmptyStackException;

public class AUQ<T> implements MyQueue<T> {
    private T[] queue;
    private int front;
    private int back;

    public AUQ(int capacity) {
        queue = (T[]) new Object[capacity];
        front = 0;
        back = -1;
    }

    public int getCount() {
        return back - front + 1;
    }

    public boolean isEmpty() {
        return getCount() == 0;
    }

    public void enqueue(T item) {
        if (getCount() < queue.length) {
            queue[++back] = item;
        } else {
            throw new IllegalStateException("Queue is full.");
        }
    }

    public T dequeue() {
        if (!isEmpty()) {
            return queue[front++];
        }
        throw new EmptyStackException();
    }

    public T peek() {
        if (!isEmpty()) {
            return queue[front];
        }
        throw new EmptyStackException();
    }

    public void clear() {
        front = 0;
        back = -1;
    }
}
