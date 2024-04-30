
public class LinkedQueue<T> extends Queue<T> {
    private Node<T> head;
    private Node<T> tail;

    public T front() {
        return isEmpty() ? null : head.getContent();
    }

    public T dequeue() {
        if (isEmpty()) return null;
        T data = head.getContent();
        head = head.getNext();
        return data;
    }

    public void enqueue(T x) {
        if (isEmpty()) head = tail = new Node<T>(x);
        else if (head == tail) {
            tail = new Node<T>(x);
            head.setNext(tail);
        }
        else {
            Node<T> t = new Node<T>(x);
            tail.setNext(t);
            tail = t;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}
