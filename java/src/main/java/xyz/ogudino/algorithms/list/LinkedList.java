package xyz.ogudino.algorithms.list;

public class LinkedList<T> {

    public static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public Node<T> head;

    public int size;

    public LinkedList(T data) {
        head = new Node<>(data);
        size = 1;
    }

}