public interface MyQueue<T> {
    int getCount();
    boolean isEmpty();
    void enqueue(T item);
    T dequeue();
    T peek();
    void clear();
}
