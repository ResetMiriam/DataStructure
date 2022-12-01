package NodeStack;

public class Stack {

    private Node top;
    public int count;

    public Stack() {
        top = null;
        count = 0;
    }

    public void push(int data) {
        if (top != null) {
            top.setNext(new Node(data));
            top = top.getNext();
        } else {
            top = new Node(data);

        }
        count++;
    }


    public String toString() {
        String aux = "";

        for (Node node = top; node != null;
             node = node.getNext()) {
            aux = aux + node.getData();
        }
        return aux;
    }

}
