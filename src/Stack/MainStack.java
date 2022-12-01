package Stack;

public class MainStack {
    public static void main(String[] args) {

        IntStack s = new IntStack(5);

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println(s.pop()); // 5
        System.out.println(s.pop()); // 4
        System.out.println(s.pop()); // 3
        System.out.println(s.peek()); // 5
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()) System.out.println(s.pop());

        ArrayStack a = new ArrayStack();

        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);

        System.out.println(a.pop()); // 5
        System.out.println(a.pop()); // 4
        System.out.println(a.pop()); // 3

        a.push(3);
        a.push(4);
        a.push(5);

        while (!a.isEmpty()) System.out.println(a.pop());

    }
}
