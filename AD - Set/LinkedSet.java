import java.util.HashSet;
import java.util.NoSuchElementException;

public class LinkedSet<T> {
    private int size;
    private Node<T> head;
    private Node<T> tail;
    private Node<T> current;
    private HashSet<T> set;

    public LinkedSet() {
        size = 0;
        head = null;
        tail = null;
        current = null;
        set = new HashSet<>();
    }

    public void addItem(T data) {
        if (!set.contains(data)) {
            Node<T> newNode = new Node<>(data);
            if (size == 0) {
                head = newNode;
                tail = newNode;
                current = newNode;
            } else {
                tail.setNext(newNode);
                newNode.setBefore(tail);
                tail = newNode;
            }
            set.add(data);
            size++;
        }
    }

    public void addItemAtIndex(T data, int index) {
        if (!set.contains(data)) {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            if (index == size) {
                addItem(data);
                return;
            }
            Node<T> newNode = new Node<>(data);
            if (index == 0) {
                newNode.setNext(head);
                head.setBefore(newNode);
                head = newNode;
            } else {
                Node<T> temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.getNext();
                }
                newNode.setNext(temp.getNext());
                newNode.setBefore(temp);
                temp.getNext().setBefore(newNode);
                temp.setNext(newNode);
            }
            set.add(data);
            size++;
        }
    }

    public T getItem(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<T> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        current = temp;
        return temp.getContent();
    }

    public void next() {
        if (current == null || current.getNext() == null) {
            throw new NoSuchElementException("No next element");
        }
        current = current.getNext();
    }

    public void before() {
        if (current == null || current.getBefore() == null) {
            throw new NoSuchElementException("No previous element");
        }
        current = current.getBefore();
    }
    
    public int getSize() {
        return size;
    }
}
