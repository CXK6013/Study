package com.cxk.headlinklist;

/**
 * @author XingKe
 * @date 2019-04-26 16:09
 */
public class LinkLists<T> {
    private class Node{
        private T data;
        private Node next;
        private Node(){

        }
        private Node(T data, Node next){
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }
    /**
     * 保存链表的头结点
     */
    private Node header;
    /**
     * 保存链表的尾结点，采用尾插法添加结点时，不需要遍历整个链表
     */
    private Node tail;
    /**
     *   保存链表中已包含的节点数
     */

    private int size;

    public LinkLists(){
        header = tail = null;
    }
    public LinkLists(T element){
        header = new Node(element, null);
        tail = header;
        size++;
    }
    public void add(T element){
        if(header == null){
            header = new Node(element, null);
            tail = header;
        }
        else{
            Node newNode = new Node(element, null);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public Node getHeader() {
        return header;
    }

    public Node getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for(Node current = header; current != null; current = current.next){
            sb.append(current.data.toString() + ", ");
        }
        int len = sb.length();
        //注意删除最后添加的两个多余的字符
        return sb.delete(len - 2, len).append("]").toString();
    }
}
