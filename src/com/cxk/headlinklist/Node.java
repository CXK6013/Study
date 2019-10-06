package com.cxk.headlinklist;

/**
 * @author XingKe
 * @date 2019-04-25 20:32
 */
public class Node<T> {
     T data;
     Node next;
    public Node(){

    }

    public Node(Node header,Node next) {
        header.next = next;
    }

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(Node next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
    public  void append(Node tail , Node newNode){
        tail.next = newNode;
    }
}
