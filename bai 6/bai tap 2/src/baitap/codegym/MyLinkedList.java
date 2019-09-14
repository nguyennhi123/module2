package baitap.codegym;
import java.util.Iterator;

public class MyLinkedList<E> extends MyAbstractList<E> {
    Node<E> head, tail;

    public MyLinkedList(){

    }

    public MyLinkedList(E[] objects){
        super(objects);
    }

    @Override
    public void add(int index, E e) {
        if (index == 0)
            addFirst(e);
        else if (index >= count)
            addLast(e);
        else {
            Node<E> current = head;
            for (int i = 1; i < index; i++){
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<E>(e);
            (current.next).next = temp;
            count++;
        }
    }

    public E getFirst(){
        if (count == 0) {
            return null;
        }
        else {
            return head.element;
        }
    }

    public E getLast() {
        if (count == 0) {
            return null;
        }
        else {
            return tail.element;
        }
    }

    public E removeFirst(){
        if(count == 0)
            return null;
        else {
            Node<E> temp = head;
            head = head.next;
            count--;
            if(head == null)
                tail = null;
            return temp.element;
        }
    }

    public E removeLast(){
        if(count == 0)
            return null;
        else if(count == 1){
            Node<E> temp = head;
            head = tail = null;
            count = 0;
            return temp.element;
        } else {
            Node<E> current = head;
            for (int i = 0; i < size() - 2; i++){
                current = current.next;
            }
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            count--;
            return temp.element;
        }
    }

    public void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        count++;
        if (tail == null)
            tail = head;
    }

    public void addLast(E e){
        Node<E> newNode = new Node<>(e);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        count++;
    }

    @Override
    public void clear() {
        count = 0;
        head = tail = null;
    }

    @Override
    public boolean contains(E e) {
        //TODO
        throw new UnsupportedOperationException();
    }

    @Override
    public E get(int index) {
        //TODO
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(E e) {
        //TODO
        throw new UnsupportedOperationException();
    }

    @Override
    public int lastIndexOf(E e) {
        //TODO
        throw new UnsupportedOperationException();
    }

    @Override
    public E remove(int index) {
        //TODO
        throw new UnsupportedOperationException();
    }

    @Override
    public Object set(int index, E e) {
        //TODO
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<E> iterator() {
        return new MyLinkedListIterator();
    }

    private class MyLinkedListIterator implements java.util.Iterator<E> {
        private Node<E> current = head;
        @Override
        public boolean hasNext() {
            return (current != null);
        }

        @Override
        public E next() {
            E e = current.element;
            current = current.next;
            return e;
        }

        @Override
        public void remove() {
            //TODO
        }
    }

    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }
}
