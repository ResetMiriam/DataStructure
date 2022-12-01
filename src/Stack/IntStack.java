package Stack;

public class IntStack implements Stack<Integer> {

    private int[] intArr;
    private int position = 0;

    public IntStack(int maxSz) {
        intArr = new int[maxSz];
    }

    public int size() {
        return position;
    }

    public boolean isEmpty() {
        return position == 0;
    }

    @Override
    public Integer peek() {
        return intArr[position - 1];
    }

    @Override
    public void push(Integer value) {
        intArr[position++] = value;
    }

    @Override
    public Integer pop() {
        return intArr[--position];
    }
}
