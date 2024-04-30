
public class Node<T> {
    T content;
    Node<T> next;
    Node<T> before;

    public Node(T data) {
        content = data;
    }
    
    public void setNext(Node<T> next) {
        this.next = next;
    }
    
    public void setBefore(Node<T> before) {
        this.before = before;
    }
    
    public Node<T> getNext() {
        return next;
    }
    
    public Node<T> getBefore() {
        return before;
    }
    
    public T getContent() {
        return content;
    }
}
