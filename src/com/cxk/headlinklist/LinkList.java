package com.cxk.headlinklist;

/**
 * @author XingKe
 * @date 2019-04-25 20:34
 */
public class LinkList<T> {
    /**
     * 保存链表的头节点
      */
    private Node header;
    /**
     * 保存尾节点
     */
    private Node tail;

    /**
     * 链表的长度
     */
    private  int size;

    public LinkList() {
        header = tail = null;
    }
    public  LinkList(T element){
        header = new Node(element,null);
        tail = header;
        size++;
    }
    /**
     * 采用头插法创建单链表
     */
    public  void aAtHeader(T element){
        header = new Node<>(element,header);
        if (tail == header){
            tail = header;
        }
        size++;
    }

    public void add(T element){
        if (header == null){
            header = new Node(element,null);
            tail = header;
        }else{
            Node newNode = new Node(element, null);
            tail.append(tail,newNode);
            tail = newNode;
        }
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

}
