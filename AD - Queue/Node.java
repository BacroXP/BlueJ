
public class Node<T>
{
    private T data;
    private Node<T> next;

    public Node(T daten)
    {
        this.data = daten;
    }

    public void setNext(Node nextNode)
    {
        this.next = nextNode;
    }

    public Node getNext()
    {
        return this.next;
    }

    public T getContent()
    {
        return this.data;
    }    

}
