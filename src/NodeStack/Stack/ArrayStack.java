package Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<T> implements Stack<T> {
    private int size;
    private int capacity;
    private Object[] arr;

    public ArrayStack() {
        capacity = 12;
        arr = new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void push(T elem) {
        if (size == capacity) {
            increaseCapacity();
        }
        arr[size++] = elem;
    }

    private void increaseCapacity() {
        capacity *= 2;
        arr = Arrays.copyOf(arr, capacity);
    }

    @Override
    public T pop() {
        if (isEmpty()) throw new EmptyStackException();
        T elem = (T) arr[--size];
        arr[size] = null;
        return elem;
    }

    @Override
    public T peek() {
        if (isEmpty()) throw new EmptyStackException();
        return (T) arr[size - 1];
    }
}
