package Queue;

public interface Queue<T> {
    public void add(T elem);

    public T poll();

    public T peek();

    public int size();

    public boolean isEmpty();
}
