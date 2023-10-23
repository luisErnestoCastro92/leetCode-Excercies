package dataStructure;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int length;

    public LinkedList(T value) {
        Node<T> newNode = new Node<>(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public T printList() {
        Node<T> temp = this.head;
        T value = null;
        while (temp != null) {
            value = temp.getValue();
            temp = temp.getNext();
        }
        return value;
    }

    public void append(T value) {
        Node<T> newNode = new Node<>(value);
        if (this.length == 0) {
            this.head = newNode;
        } else {
            this.tail.setNext(newNode);
        }
        this.tail = newNode;
        length++;
    }

    public Node<T> removeLast() {
        if (length == 0) {
            return null;
        }
        Node<T> temp = this.getHead();
        Node<T> pre = this.getHead();
        while (temp.getNext() != null) {
            pre = temp;
            temp = temp.getNext();
        }
        this.tail = pre;
        this.tail.setNext(null);
        this.length--;
        if (this.length == 0) {
            this.setHead(null);
            this.setTail(null);
        }
        return temp;
    }


    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    public int getLengt() {
        return length;
    }

    public void setLengt(int lengt) {
        this.length = lengt;
    }

}
