package com.cxk.linklist;

import java.util.Objects;

/**
 * @author XingKe
 * @date 2019-04-25 11:21
 */
public class Node {

    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    /**
     *
     * @param node
     * 移除当前节点的下一个节点
     */
    public boolean deleteNode(){
        //单个节点即是一个单链表
        Node currNode = this;
       if (currNode.next == null){
           return false;
       }else {
           currNode.next = currNode.next.next;
           return false;
       }
    }

    /**
     *
     * @param node
     * @return
     */
    public  Node append(Node node){
        Node currNode = this;
        while (true){
            Node nextNode = currNode.next;

            if (nextNode == null){
                break;
            }
            currNode = nextNode;
        }
        currNode.next = node;
        return this;
    }

    /**
     *
     * @param node
     * @return 向当前节点后追加节点
     * 如果当前节点后面是空的 跟追加的结果是一样的
     */
    public boolean insertNode(Node node){
            if (isLast()){
                this.next = node;
                return true;
            }else {
                Node currNode= this;
                Node nextNode = currNode.next;
                currNode.next = node;
                node.next = nextNode;
                return true;
            }
    }

    private boolean isLast() {
        if (this.next == null){
            return true;
        }else{
            return false;
        }
    }

    public  Node getCurrNode(){
        return this;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}
