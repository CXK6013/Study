package com.cxk.linklist;

/**
 * @author XingKe
 * @date 2019-04-25 13:56
 * 不带头节点的循环链表
 */
public class LoopNode {

    private int data;
    private LoopNode next = this;

    public LoopNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public LoopNode getNext() {
        return next;
    }

    public LoopNode afterInsert(LoopNode node){
        LoopNode currNode = this;
        // 判断头节点
        LoopNode nextNode = currNode.next;
        currNode.next = node;
        node.next = nextNode;
        return this;
    }

    /**
     * 循环链表  移除下一个节点
     */
    public boolean deleteNode(){
        LoopNode currNode = this;
        if (currNode.next == currNode){
            return false;
        }else {
            currNode.next = currNode.next.next;
            return true;
        }
    }
}
