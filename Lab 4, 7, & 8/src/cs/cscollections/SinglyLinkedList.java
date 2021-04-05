package cs.cscollections;

public class SinglyLinkedList<E> implements List<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size = 0;


    @Override
    public void append(E ele) {
        Node<E> newNode = new Node<>(ele);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    @Override
    public void prepend(E ele) {
        Node<E> newNode = new Node<>(ele);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    @Override
    public int getLength() {

        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    public static void main(String [] args) {
        SinglyLinkedList<String> myList = new SinglyLinkedList<>();
        SinglyLinkedList<Integer> stuffList = new SinglyLinkedList<>();

        System.out.println("List is empty: " + myList.isEmpty());
        System.out.println("Length is: " + myList.getLength());

        myList.append("Bryan");
        myList.append("Carl");
        myList.append("Sally");

        stuffList.prepend(57);

        System.out.println("Length now is: " + myList.getLength());


    }
}

