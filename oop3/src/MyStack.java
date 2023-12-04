public interface MyStack<T> {
    int getCount();
    boolean isEmpty();
    void push(T item);
    T peek();
    T pop();
    void clear();
}
