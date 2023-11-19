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
        this.length++;
    }

    public void prepend(T value) {
        Node<T> newNode = new Node<>(value);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.setNext(getHead());
            this.setHead(newNode);
        }
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

    public Node<T> removeFirst() {
        if (this.length == 0) return null;
        Node<T> temp = this.getHead();
        head = head.getNext();
        temp.setNext(null);
        this.length--;
        if (this.length == 0) {
            this.setTail(null);
        }
        return temp;
    }

    public Node<T> get(int index) {
        if (index < 0 || index >= this.length) {
            return null;
        }
        Node<T> temp = this.getHead();
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    public boolean set(int index, T value) {
        Node<T> temp = get(index);
        if (temp != null) {
            temp.setValue(value);
            return true;
        }
        return false;
    }

    public boolean insert(int index, T value) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            this.length++;
        } else if (index == this.length) {
            append(value);
            this.length++;
        }
        Node<T> newNode = new Node<>(value);
        Node<T> temp = get(index -1);;
        newNode = temp.getNext();
        temp.setNext(newNode);
        this.length++;
        return true;
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
