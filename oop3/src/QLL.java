import java.util.LinkedList;
import java.util.NoSuchElementException;

public class QLL<T> implements MyQueue<T> {
    private LinkedList<T> queue;

    public QLL() {
        queue = new LinkedList<>();
    }

    public int getCount() {
        return queue.size();
    }

    public boolean isEmpty() {
        return getCount() == 0;
    }

    public void enqueue(T item) {
        queue.addLast(item);
    }

    public T dequeue() {
        if (!isEmpty()) {
            T item = queue.getFirst();
            queue.removeFirst();
            return item;
        }
        throw new NoSuchElementException("Queue is empty.");
    }

    public T peek() {
        if (!isEmpty()) {
            return queue.getFirst();
        }
        throw new NoSuchElementException("Queue is empty.");
    }

    public void clear() {
        queue.clear();
    }
}
