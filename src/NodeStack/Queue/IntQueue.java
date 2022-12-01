package Queue;

public class IntQueue implements Queue<Integer> {

    private int[] data;
    private int head, end;
    private int size;

    public IntQueue(int maxSize) {
        head = end = size = 0;
        data = new int[maxSize];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public Integer peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        head = head % data.length;
        return data[head];
    }

    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public void add(Integer value) {
        if (isFull()) {
            throw new RuntimeException("Queue is too small!");
        }
        data[end++] = value;
        size++;
        end = end % data.length;
    }

    @Override
    public Integer poll() {
        if (size == 0) {
            throw new RuntimeException("Queue is empty.");
        }
        size--;
        head = head % data.length;
        return data[head++];
    }
}
