package Queue;

public class MainQueue {
    public static void main(String[] args) {

        IntQueue q = new IntQueue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q.poll()); // 1
        System.out.println(q.poll()); // 2
        System.out.println(q.poll()); // 3
        System.out.println(q.poll()); // 4

        System.out.println(q.isEmpty()); // false

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.poll()); // 5
        System.out.println(q.poll()); // 1
        System.out.println(q.poll()); // 2
        System.out.println(q.poll()); // 3

        System.out.println(q.isEmpty()); // true

        LinkedQueue l = new LinkedQueue<>(6);

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        System.out.println(l.poll()); // 6
        System.out.println(l.poll()); // 1
        System.out.println(l.poll()); // 2
        System.out.println(l.poll()); // 3

        System.out.println(l.isEmpty()); // false

        l.add(1);
        l.add(2);
        l.add(3);

        System.out.println(l.poll()); // 4
        System.out.println(l.poll()); // 5
        System.out.println(l.poll()); // 1
        System.out.println(l.poll()); // 2
        System.out.println(l.poll()); // 3


        System.out.println(l.isEmpty()); // true

    }
}
