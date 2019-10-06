package com.cxk.linklist;

/**
 * @author XingKe
 * @date 2019-04-25 16:05
 * 双向循环链表
 * 显示的指明头节点
 */
public class DoubleLoopNode {

    private  DoubleLoopNode  preNode = this;
    private  int data;
    private  DoubleLoopNode  next = this;

    public DoubleLoopNode(int data) {
        this.data = data;
    }

    public DoubleLoopNode getPreNode() {
        return preNode;
    }

    public int getData() {
        return data;
    }

    public DoubleLoopNode getNext() {
        return next;
    }

    /**
     *
     * @param node
     * @return
     */
    public  void after(DoubleLoopNode node){

        //原来的下一个节点
        DoubleLoopNode nextNext = next;
        //把新节点做为当前节点的下一个节点
        this.next=node;
        //把当前节点做新节点的前一个节点
        node.preNode=this;
        //让原来的下一个节点作新节点的下一个节点
        node.next=nextNext;
        //让原来的下一个节点的上一个节点为新节点
        nextNext.preNode=node;
    }

    /**
     * 移除下一个节点
     */
    public  void removeNode(){
        // 获取当前节点
        DoubleLoopNode currNode = this;
        //
        currNode.next = currNode.next.next;
        currNode.next.next.preNode = currNode.next;
    }
}
